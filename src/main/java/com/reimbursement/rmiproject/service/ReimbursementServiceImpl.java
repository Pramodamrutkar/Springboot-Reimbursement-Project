package com.reimbursement.rmiproject.service;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import com.reimbursement.rmiproject.dto.NewReimbursementRequestDTO;
import com.reimbursement.rmiproject.dto.ReimbursementDTO;
import com.reimbursement.rmiproject.dto.ReimbursementProcessDTO;
import com.reimbursement.rmiproject.dto.ReimbursementTypeDTO;
import com.reimbursement.rmiproject.entity.ReimbursementRequest;
import com.reimbursement.rmiproject.entity.ReimbursementTypes;
import com.reimbursement.rmiproject.exception.DataNotfoundException;
import com.reimbursement.rmiproject.exception.ValidationsException;
import com.reimbursement.rmiproject.repository.ReimbursementRequestRepository;
import com.reimbursement.rmiproject.repository.ReimbursementTypeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import static com.reimbursement.rmiproject.constants.CommonConstants.HTML_RECEIPT_BODY;

@Service
@Slf4j
public class ReimbursementServiceImpl implements ReimbursementService {

    @Autowired
    ReimbursementTypeRepository reimbursementTypeRepository;

    @Autowired
    ReimbursementRequestRepository reimbursementRequestRepository;

    @Value("${app.file-upload-dir}")
    private String fileUploadDirectory;

    @Override
    public List<ReimbursementTypeDTO> fetchReimbursementTypeData() throws Exception {
        List<ReimbursementTypeDTO> reimbursementTypeDTOList = new ArrayList<>();
        List<ReimbursementTypes> reimbursementTypes = reimbursementTypeRepository.findAll();
        if(reimbursementTypes.isEmpty()){
            throw new DataNotfoundException("No reimbursement types added in the system!");
        }
        reimbursementTypes.forEach(data -> {
            ReimbursementTypeDTO reimbursementTypeDTO = new ReimbursementTypeDTO();
            reimbursementTypeDTO.setId(data.getId());
            reimbursementTypeDTO.setType(data.getType());
            reimbursementTypeDTOList.add(reimbursementTypeDTO);
        });
        return reimbursementTypeDTOList;
    }

    @Override
    public ReimbursementRequest addReimbursement(NewReimbursementRequestDTO newReimbursementRequestDTO) {
        ReimbursementRequest reimbursement = new ReimbursementRequest();
        String fileName = "";
        Path fileStorageLocation = null;
        if(newReimbursementRequestDTO.getReimbursementTypeId() == 0){
            log.info("reimbursementTypeId {}", newReimbursementRequestDTO.getReimbursementTypeId());
            throw new ValidationsException("Invalid reimbursement type id");
        }
        if(newReimbursementRequestDTO.getTravelRequestId() == 0){
            log.info("TravelRequestId {}", newReimbursementRequestDTO.getTravelRequestId());
            throw new ValidationsException("Invalid travel request type id");
        }

        if(newReimbursementRequestDTO.getDocumentUrl() != null){
            try {
                fileStorageLocation = Paths.get(fileUploadDirectory).toAbsolutePath().normalize();
                Files.createDirectories(fileStorageLocation);
            } catch (Exception ex) {
                throw new RuntimeException(
                        "Could not create the directory where the uploaded files will be stored.", ex);
            }
            fileName = new Date().getTime() + "-file." + newReimbursementRequestDTO.getDocumentUrl().getOriginalFilename();
            try {
                // Check if the filename contains invalid characters
                if (fileName.contains("..")) {
                    throw new RuntimeException(
                            "Sorry! Filename contains invalid path sequence " + fileName);
                }

                Path targetLocation = fileStorageLocation.resolve(fileName);
                Files.copy(newReimbursementRequestDTO.getDocumentUrl().getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);

            } catch (IOException ex) {
                throw new RuntimeException("Could not store file " + fileName + ". Please try again!", ex);
            }
        }else{
            throw new ValidationsException("Upload image shouldn't be blank");
        }

        reimbursement.setReimbursementTypeId(newReimbursementRequestDTO.getReimbursementTypeId());
        reimbursement.setDocumentUrl(fileName);
        reimbursement.setInvoiceAmount(newReimbursementRequestDTO.getInvoiceAmount());
        reimbursement.setInvoiceNo(newReimbursementRequestDTO.getInvoiceNo());
        reimbursement.setInvoiceDate(newReimbursementRequestDTO.getInvoiceDate());
        reimbursement.setRequestRaisedByEmployeeId(newReimbursementRequestDTO.getRequestRaisedByEmployeeId());
        reimbursement.setRequestProcessedByEmployeeId(newReimbursementRequestDTO.getRequestProcessedByEmployeeId());
        reimbursement.setTravelRequestId(newReimbursementRequestDTO.getTravelRequestId());
        reimbursement.setRequestDate(new Date());
        reimbursement.setRequestProcessedOn(new Date());
        return reimbursementRequestRepository.save(reimbursement);
    }

    @Override
    public List<ReimbursementDTO> getReimbursementByTravelId(Integer travelRequestId) throws Exception {
        List<ReimbursementDTO> reimbursementDTOSList = new ArrayList<>();
        List<ReimbursementRequest> reimbursementRequestList = reimbursementRequestRepository.findByTravelRequestId(travelRequestId);
        if(reimbursementRequestList.isEmpty()){
            throw new ValidationsException("No travel request found for this request id");
        }
        reimbursementRequestList.forEach(data -> {
            ReimbursementDTO reimbursementDTO = new ReimbursementDTO();
            reimbursementDTO.setRemarks(data.getRemarks());
            reimbursementDTO.setStatus(data.getStatus());
            reimbursementDTO.setInvoiceNo(data.getInvoiceNo());
            reimbursementDTO.setInvoiceAmount(data.getInvoiceAmount());
            reimbursementDTO.setTravelRequestId(data.getTravelRequestId());
            reimbursementDTO.setDocumentUrl(data.getDocumentUrl());
            reimbursementDTO.setRequestRaisedByEmployeeId(data.getRequestRaisedByEmployeeId());
            reimbursementDTO.setRequestProcessedByEmployeeId(data.getRequestProcessedByEmployeeId());
            reimbursementDTO.setRequestProcessedOn(data.getRequestProcessedOn());
            reimbursementDTO.setRequestDate(data.getRequestDate());
            reimbursementDTO.setReimbursementTypeId(data.getReimbursementTypeId());
            reimbursementDTOSList.add(reimbursementDTO);
        });
        return reimbursementDTOSList;
    }

    @Override
    public ReimbursementRequest getReimbursementByReimbursementId(Integer reimbursementId) throws Exception {
        Optional<ReimbursementRequest> reimbursementRequest = reimbursementRequestRepository.findById(reimbursementId);
        if(!reimbursementRequest.isPresent()){
            throw new ValidationsException("Reimbursement id is not present");
        }
        return reimbursementRequest.get();
    }

    @Override
    public ReimbursementRequest updateStatusByReimbursementId(Integer reimbursementId, ReimbursementProcessDTO reimbursementProcessDTO) throws Exception {
        Optional<ReimbursementRequest> reimbursementRequest = reimbursementRequestRepository.findById(reimbursementId);
        if (!reimbursementRequest.isPresent()) {
            throw new ValidationsException("Entered reimbursement id is not present");
        }
        reimbursementRequest.get().setStatus(reimbursementProcessDTO.getStatus());
        reimbursementRequest.get().setRemarks(reimbursementProcessDTO.getRemarks());
        return reimbursementRequestRepository.save(reimbursementRequest.get());
    }

    @Override
    public ReimbursementTypes addReimbursementType(String reimbursementType) throws Exception {
        if(isNumeric(reimbursementType)){
            throw new ValidationsException("Reimbursement should not be integer");
        }
        if(reimbursementType.isEmpty()){
            throw new ValidationsException("Reimbursement should not be empty");
        }
        ReimbursementTypes reimbursementTypes = new ReimbursementTypes();
        reimbursementTypes.setType(reimbursementType);
        return reimbursementTypeRepository.save(reimbursementTypes);
    }

    @Override
    public void generate(HttpServletResponse response) {
        try {
            Document document = new Document();
            // this method is used to get an instance of the PdfWriter.
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("html.pdf"));
            document.open();
            // Get a Singleton XMLWorkerHelper
            // parseXHtml: Parses the xml data in the given reader
            XMLWorkerHelper.getInstance().parseXHtml(writer, document, new FileInputStream(HTML_RECEIPT_BODY));
            document.close();
        } catch (IOException | DocumentException e) {
            e.printStackTrace();
        }
    }

    public static boolean isNumeric(String string) {
        int intValue;

        System.out.println(String.format("Parsing string: \"%s\"", string));

        if(string == null || string.equals("")) {
            throw new ValidationsException("String cannot be parsed, it is null or empty.");
        }

        try {
            intValue = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Input String cannot be parsed to Integer.");
        }
        return false;
    }

}
