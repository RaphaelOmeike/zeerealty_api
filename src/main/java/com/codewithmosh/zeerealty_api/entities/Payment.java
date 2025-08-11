package com.codewithmosh.zeerealty_api.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal rentFee;

    private BigDecimal agentFee;

    private BigDecimal serviceFee;

    private BigDecimal inspectionFee;

    private BigDecimal legalFee;

    private BigDecimal totalAmount;

    private PaymentStatus status;

    // confirm if cart based

    //stopped here

//    PaymentID: UUID or Long.
//
//            CustomerID: UUID or Long (foreign key).
//
//    PropertyID: UUID or Long (foreign key).
//
//    TotalAmount: BigDecimal.
//
//            PaymentDate: LocalDateTime.
//
//            Status: enum PaymentStatus { PENDING, COMPLETED, FAILED }.
//
//    RentFee, AgentFee, ServiceFee, InspectionFee, LegalFee: BigDecimal.



}
