package com.codewithmosh.zeerealty_api.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
public class CustomerPropertyId implements Serializable {

    private UUID customer; // Matches the field name in FavoriteList entity
    private UUID property; // Matches the field name in FavoriteList entity

    // Getters, setters, equals, and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerPropertyId that = (CustomerPropertyId) o;
        return Objects.equals(customer, that.customer) && Objects.equals(property, that.property);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customer, property);
    }
}