package com.codewithmosh.zeerealty_api.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Entity
@Setter
@Table(name = "kyc_documents")
public class KYCDocument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    //fk todoc
    //fk to user
    @Column(name = "status")
    private VerificationStatus status;

    @Column(name = "verified_at")
    private LocalDateTime verifiedAt;

    @OneToOne
    @JoinColumn(name = "document_id")
    private Document document;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;
}
