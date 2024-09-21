package com.reimbursement.rmiproject.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "reimbursement_types")
@Entity
public class ReimbursementTypes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "type")
    private String type;
}
