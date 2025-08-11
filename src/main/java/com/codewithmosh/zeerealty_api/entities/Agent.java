package com.codewithmosh.zeerealty_api.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "agents")
public class Agent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "agency_name")
    private String agencyName;

    @Column(name = "kyc_status")
    private KYCStatus kycStatus;

    @OneToMany(mappedBy = "property")
    private Set<Property> properties = new HashSet<>();
}
