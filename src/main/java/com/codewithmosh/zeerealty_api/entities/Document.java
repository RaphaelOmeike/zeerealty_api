package com.codewithmosh.zeerealty_api.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "documents")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long Id;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "file_path")
    private String filePath;

    @Column(name = "file_type")
    private FileType fileType;

    @Column(name = "upload_date", insertable = false, updatable = false)
    private LocalDateTime uploadedAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User uploader;
}


//DocumentID (Primary Key), FileName, FilePath (the R2 object key), FileType (e.g., KYC_DOC, PROPERTY_IMAGE, VIDEO_TOUR), UploadDate, UploaderUserID (Foreign Key to User).