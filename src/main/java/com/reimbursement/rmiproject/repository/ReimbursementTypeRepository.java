package com.reimbursement.rmiproject.repository;

import com.reimbursement.rmiproject.entity.ReimbursementTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReimbursementTypeRepository extends JpaRepository<ReimbursementTypes, Integer> {
}
