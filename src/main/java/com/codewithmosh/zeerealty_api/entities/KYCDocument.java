package com.codewithmosh.zeerealty_api.entities;

import java.time.LocalDateTime;

public class KYCDocument {

    private Long id;

    //fk todoc
    //fk to user
    private VerificationStatus status;

    private LocalDateTime verifiedAt;
}
