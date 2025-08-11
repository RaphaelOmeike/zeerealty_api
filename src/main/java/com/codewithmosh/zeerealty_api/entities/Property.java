package com.codewithmosh.zeerealty_api.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "properties")
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private String description;

    private boolean isVerified;


    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;
    //fk to the owner/agent

    @ManyToOne
    @JoinColumn(name = "agent_id")
    private Agent agent;
    //list of house features

    private List<String> amenities;


}


//id: java.util.UUID
//
//description: String
//
//price: java.math.BigDecimal
//
//status: enum Status { FOR_SALE, SOLD, RENTED }
//
//address_id: java.util.UUID (or a direct Address object with a @ManyToOne annotation)
//
//seller_id: java.util.UUID (or a direct User object with a @ManyToOne annotation)
//
//created_at: java.time.Instant
//
//updated_at: java.time.Instant