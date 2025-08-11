package com.codewithmosh.zeerealty_api.entities;

import java.time.LocalDateTime;

public class PropertyImage {
    private Long id;

    //fk todoc
    //fk to property
    private VerificationStatus status;

    private LocalDateTime verifiedAt;

    private boolean isFeatured;

    private String caption;
}
