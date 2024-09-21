package com.reimbursement.rmiproject.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ReimbursementDTO {
    private Integer travelRequestId;
    private Integer requestRaisedByEmployeeId;
    private Date requestDate;
    private Integer reimbursementTypeId;
    private String invoiceNo;
    private Integer invoiceAmount;
    private String documentUrl;
    private Date requestProcessedOn;
    private Integer requestProcessedByEmployeeId;
    private String status;
    private String remarks;
}
