package com.jbeans.Customer_loan_Circutebreaker.service;

import com.jbeans.Customer_loan_Circutebreaker.dto.Loan;
import com.jbeans.Customer_loan_Circutebreaker.repository.Loanrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanService {
    @Autowired
    Loanrepo loanrepo;

    public List<Loan> getAllLoan() {
        return loanrepo.findAll();
    }

}

