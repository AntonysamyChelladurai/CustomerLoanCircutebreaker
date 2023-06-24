package com.jbeans.Customer_loan_Circutebreaker.controller;

import com.jbeans.Customer_loan_Circutebreaker.dto.Loan;
import com.jbeans.Customer_loan_Circutebreaker.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/loan")
public class LoanDetails {
    @Autowired
    LoanService loanService;
    @GetMapping("/list")
    public List<Loan> getLoanlist(){
        return loanService.getAllLoan();
    }


}
