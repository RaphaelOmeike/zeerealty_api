package com.codewithmosh.zeerealty_api.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.aspectj.weaver.loadtime.Agent;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "agent_reviews")
public class AgentReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "comment")
    private String comment;

    @Column(name = "rating")
    private double rating;


    private Agent agent; // Assuming agentId is a foreign key to Agent entity


    private Long customerId; // Assuming customerId is a foreign key to Customer entity

    @Column(name = "createdAt", insertable = false, updatable = false)
    private LocalDateTime createdAt;
    // Constructors, getters, setters, etc. can be added as needed
}
