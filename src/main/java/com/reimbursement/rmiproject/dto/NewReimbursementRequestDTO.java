package com.reimbursement.rmiproject.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Data
public class NewReimbursementRequestDTO {
    private Integer travelRequestId;
    private Integer requestRaisedByEmployeeId;
    private Integer reimbursementTypeId;
    private String invoiceNo;
    private Integer invoiceAmount;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date invoiceDate;
    private MultipartFile documentUrl;
    private Integer requestProcessedByEmployeeId;
}
