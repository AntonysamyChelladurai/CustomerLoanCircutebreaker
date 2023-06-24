package com.jbeans.Customer_loan_Circutebreaker.repository;

import com.jbeans.Customer_loan_Circutebreaker.dto.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Loanrepo extends JpaRepository<Loan,Long> {
}
