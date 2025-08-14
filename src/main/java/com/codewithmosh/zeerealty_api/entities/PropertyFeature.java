package com.codewithmosh.zeerealty_api.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "property_features")
@IdClass(PropertyFeatureId.class)
public class PropertyFeature {
    @Id
    @ManyToOne
    @JoinColumn(name = "property_id", referencedColumnName = "id")
    private Property property;
    @Id
    @ManyToOne
    @JoinColumn(name = "feature_id", referencedColumnName = "id")
    private Feature feature;

    @Column(name = "value")
    private String value;

    @OneToMany(mappedBy = "property", cascade = CascadeType.ALL)
    private Set<PropertyFeature> features = new HashSet<>();
}
