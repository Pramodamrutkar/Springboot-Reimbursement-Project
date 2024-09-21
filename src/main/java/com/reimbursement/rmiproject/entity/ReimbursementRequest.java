package com.reimbursement.rmiproject.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "reimbursement_request")
public class ReimbursementRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "travel_request_id", length = 10)
    private Integer travelRequestId;

    @Column(name = "request_raise_by_employee_id", length = 10)
    private Integer requestRaisedByEmployeeId;

    @Column(name = "request_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date requestDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "invoice_date")
    private Date invoiceDate;

    @Column(name = "reimbursementTypeId", length = 10)
    private Integer reimbursementTypeId;

    @Column(name = "invoice_no", length = 20)
    private String invoiceNo;

    @Column(name = "invoice_amount", length = 10)
    private Integer invoiceAmount;

    @Column(name = "document_url", length = 100)
    private String documentUrl;

    @Column(name = "request_processed_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date requestProcessedOn;

    @Column(name = "request_processed_by_employee_id", length = 10)
    private Integer requestProcessedByEmployeeId;

    @Column(name = "status", length = 10)
    private String status;

    @Column(name = "remarks",length = 100)
    private String remarks;
}
