package com.codewithmosh.zeerealty_api.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "properties")
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
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
    @OneToOne(mappedBy = "property")
    private Payment payment;

    @OneToMany(mappedBy = "property")
    private Set<PropertyImage> propertyImages = new HashSet<>();

    @OneToMany(mappedBy = "property")
    private Set<PropertyVideo> propertyVideos = new HashSet<>();

    @OneToMany(mappedBy = "property", cascade = CascadeType.ALL)
    private Set<CustomerProperty> likingCustomers = new HashSet<>();

    @Column(name = "amenities")
    private String amenitiesString; //if there is a way I could alternate between strings
    private List<String> amenities; //if there is a way I could alternate between strings
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