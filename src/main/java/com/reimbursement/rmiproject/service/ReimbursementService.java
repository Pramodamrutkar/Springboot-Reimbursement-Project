package com.reimbursement.rmiproject.service;

import com.reimbursement.rmiproject.dto.NewReimbursementRequestDTO;
import com.reimbursement.rmiproject.dto.ReimbursementDTO;
import com.reimbursement.rmiproject.dto.ReimbursementProcessDTO;
import com.reimbursement.rmiproject.dto.ReimbursementTypeDTO;
import com.reimbursement.rmiproject.entity.ReimbursementRequest;
import com.reimbursement.rmiproject.entity.ReimbursementTypes;
import org.springframework.http.HttpStatus;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface ReimbursementService {

    List<ReimbursementTypeDTO> fetchReimbursementTypeData() throws Exception;

    ReimbursementRequest addReimbursement(NewReimbursementRequestDTO newReimbursementRequestDTO);

    List<ReimbursementDTO> getReimbursementByTravelId(Integer travelRequestId) throws Exception;

    ReimbursementRequest getReimbursementByReimbursementId(Integer reimbursementId) throws Exception;

    ReimbursementRequest updateStatusByReimbursementId(Integer reimbursementId, ReimbursementProcessDTO reimbursementProcessDTO) throws Exception;

    ReimbursementTypes addReimbursementType(String reimbursementType) throws Exception;

    void generate(HttpServletResponse response);
}
