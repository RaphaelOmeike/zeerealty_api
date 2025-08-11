package com.codewithmosh.zeerealty_api.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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

    @ManyToOne
    @JoinColumn(name = "agent_id")
//    @ToString.Exclude
    private Agent agent;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    @ToString.Exclude
    private Customer customer;

    @Column(name = "createdAt", insertable = false, updatable = false)
    private LocalDateTime createdAt;
}
