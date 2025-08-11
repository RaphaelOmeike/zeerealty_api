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

    private BigDecimal RentFee;

    private BigDecimal AgentFee;

    private BigDecimal ServiceFee;

    private BigDecimal InspectionFee;

    private BigDecimal LegalFee;


}
