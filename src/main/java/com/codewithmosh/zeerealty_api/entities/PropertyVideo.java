package com.codewithmosh.zeerealty_api.entities;

import java.sql.Time;
import java.time.LocalDateTime;

public class PropertyVideo {
    private Long id;

    //fk todoc
    //fk to property
    private VerificationStatus status;

    private LocalDateTime verifiedAt;

    private boolean isFeatured;

    private Time Duration;

    private String thumbnailPath;


}
