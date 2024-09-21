package com.reimbursement.rmiproject.controller;

import com.reimbursement.rmiproject.dto.NewReimbursementRequestDTO;
import com.reimbursement.rmiproject.dto.ReimbursementDTO;
import com.reimbursement.rmiproject.dto.ReimbursementProcessDTO;
import com.reimbursement.rmiproject.dto.ReimbursementTypeDTO;
import com.reimbursement.rmiproject.entity.ReimbursementRequest;
import com.reimbursement.rmiproject.entity.ReimbursementTypes;
import com.reimbursement.rmiproject.service.ReimbursementService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/reimbursements")
@Slf4j
public class ReimbursementController {

    @Autowired
    ReimbursementService reimbursementService;


    @Operation(summary = "API to add reimbursement types")
    @PostMapping("/types/add")
    public ResponseEntity<ReimbursementTypes> storeReimbursementTypes(@RequestParam(value = "type") String reimbursementType) throws Exception {
        ReimbursementTypes reimbursementTypes = reimbursementService.addReimbursementType(reimbursementType);
        return new ResponseEntity<>(reimbursementTypes,HttpStatus.CREATED);
    }

    @Operation(summary = "API to fetch reimbursement types")
    @GetMapping("/types")
    public ResponseEntity<List<ReimbursementTypeDTO>> getReimbursementData() throws Exception {
        List<ReimbursementTypeDTO> reimbursementTypeDTOS = reimbursementService.fetchReimbursementTypeData();
        return new ResponseEntity<>(reimbursementTypeDTOS, HttpStatus.OK);
    }

    @Operation(summary = "API to add reimbursement")
    @PostMapping(value = "/add", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity<ReimbursementRequest> storeReimbursement(@ModelAttribute NewReimbursementRequestDTO newReimbursementRequestDTO){
        log.info("coming inside the apis");
        ReimbursementRequest reimbursement = reimbursementService.addReimbursement(newReimbursementRequestDTO);
        return new ResponseEntity<>(reimbursement,HttpStatus.CREATED);
    }

    @Operation(summary = "API to return reimbursement request by travel id")
    @GetMapping("/{travelRequestId}/requests")
    public ResponseEntity<List<ReimbursementDTO>> fetchReimbursementByTravelId(@PathVariable(value = "travelRequestId") Integer travelRequestId) throws Exception {
        List<ReimbursementDTO> reimbursementDTOSList = reimbursementService.getReimbursementByTravelId(travelRequestId);
        return new ResponseEntity<>(reimbursementDTOSList,HttpStatus.OK);
    }

    @Operation(summary = "API to view details of single reimbursement request by reimbursement Id")
    @GetMapping("/{reimbursementId}")
    public ResponseEntity<ReimbursementRequest> fetchReimbursementByReimbursementId(@PathVariable(value = "reimbursementId") Integer reimbursementId) throws Exception {
        ReimbursementRequest reimbursement = reimbursementService.getReimbursementByReimbursementId(reimbursementId);
        return new ResponseEntity<>(reimbursement,HttpStatus.OK);
    }

    @Operation(summary = "API to accept or reject a given reimbursement")
    @PutMapping("/{reimbursementId}/process")
    public ResponseEntity<ReimbursementRequest> updateByReimbursementId(@PathVariable(value = "reimbursementId") Integer reimbursementId, @RequestBody ReimbursementProcessDTO reimbursementProcessDTO) throws Exception {
        ReimbursementRequest reimbursementRequest = reimbursementService.updateStatusByReimbursementId(reimbursementId, reimbursementProcessDTO);
        return new ResponseEntity<>(reimbursementRequest,HttpStatus.OK);
    }

    @GetMapping("/pdf/students")
    public void generatePdf(HttpServletResponse response) {

        response.setContentType("application/pdf");
        DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD:HH:MM:SS");
        String currentDateTime = dateFormat.format(new Date());
        String headerkey = "Content-Disposition";
        String headervalue = "attachment; filename=pdf_" + currentDateTime + ".pdf";
        response.setHeader(headerkey, headervalue);

        reimbursementService.generate(response);

    }
}
