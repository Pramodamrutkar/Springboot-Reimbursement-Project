package com.reimbursement.rmiproject.repository;

import com.reimbursement.rmiproject.entity.ReimbursementRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReimbursementRequestRepository extends JpaRepository<ReimbursementRequest,Integer> {
   List<ReimbursementRequest> findByTravelRequestId(Integer travelRequestId);

}
