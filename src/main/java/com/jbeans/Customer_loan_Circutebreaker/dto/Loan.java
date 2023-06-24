package com.jbeans.Customer_loan_Circutebreaker.dto;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name="loan_data")
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "loan_id", nullable = false)
    long loan_id;
    @Column(name="custid")
    long custid;
    @Column(name="purpose")
    String purpose;
    @Column(name="interest")
    float interest;
    @Column(name="installment")
    long installment;
    @Column(name="revolbal")
    double revolbal;
    @Column(name="amount")
    long amount;
}
