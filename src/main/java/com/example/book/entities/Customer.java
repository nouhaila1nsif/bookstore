package com.example.book.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Data
@AllArgsConstructor
@NoArgsConstructor
// Customer entity
@Entity
public class Customer {

    @Id
    private Long id;

    // Other customer properties...

    @OneToMany(mappedBy = "customer")
    private List<Order> orders;

    public Customer(Long userId) {

    }

    // Getters and setters for orders
}
