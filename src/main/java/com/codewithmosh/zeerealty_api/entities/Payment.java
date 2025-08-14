package com.codewithmosh.zeerealty_api.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "transaction_reference")
    private String transactionReference;

    @Column(name = "rent_fee")
    private BigDecimal rentFee;

    @Column(name = "agent_fee")
    private BigDecimal agentFee;

    @Column(name = "service_fee")
    private BigDecimal serviceFee;

    @Column(name = "inspection_fee")
    private BigDecimal inspectionFee;

    @Column(name = "legal_fee")
    private BigDecimal legalFee;

    @Column(name = "total_amount")
    private BigDecimal totalAmount;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private PaymentStatus status;

    @Column(name = "payment_date")
    private LocalDateTime paymentDate;
    // confirm if cart based
    @Column(name = "is_successful")
    private boolean isSuccessful;
    @OneToOne
    @JoinColumn(name = "property_id")
    private Property property;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

}
