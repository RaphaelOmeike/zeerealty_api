package com.codewithmosh.zeerealty_api.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;

@Getter
@Setter
@Table(name = "property_videos")
@Entity
public class PropertyVideo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "is_featured")
    private boolean isFeatured;

    @Column(name = "duration")
    private Time Duration;

    @Column(name = "thumbnail_path")
    private String thumbnailPath;

    @OneToOne
    @JoinColumn(name = "document_id")
    private Document document;

    @ManyToOne
    @JoinColumn(name = "property_id")
    private Property property;

}
