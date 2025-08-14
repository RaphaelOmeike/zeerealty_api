package com.codewithmosh.zeerealty_api.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "kyc_status")
    private KYCStatus kycStatus;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private Set<CustomerProperty> likedProperties = new HashSet<>();

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private Set<Payment> payments = new HashSet<>();
}
