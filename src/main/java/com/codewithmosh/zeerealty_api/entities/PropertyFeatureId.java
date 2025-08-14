package com.codewithmosh.zeerealty_api.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
public class PropertyFeatureId implements Serializable {
    private Long property; // Matches the field name in PropertyFeatures entity
    private Long feature;  // Matches the field name in PropertyFeatures entity

    // Getters, setters, equals, and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PropertyFeatureId that = (PropertyFeatureId) o;
        return Objects.equals(property, that.property) && Objects.equals(feature, that.feature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(property, feature);
    }
}