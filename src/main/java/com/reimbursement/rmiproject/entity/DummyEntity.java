package com.reimbursement.rmiproject.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "dummy_entity")
@Entity
@Data
public class DummyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "firstname", columnDefinition = "TEXT")
    private String firstName;
}
