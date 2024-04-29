package com.example.book.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate; // Consider using LocalDate instead of Date

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Assuming auto-increment
    private Long id;

    // Other order properties...

    @ManyToOne
    @JoinColumn(name = "customer_id") // Maintain this for customer relationship
    private Customer customer;

    // Removed redundant customerId field (Option 1)

    @Temporal(TemporalType.DATE) // Consider using LocalDate instead
    private LocalDate orderDate; // Date of the order

    public int getQuantity() {
        return 0;
    }

    public Book[] getBooks() {
        return null;
    }


    // Additional methods or properties as needed

    // Getters and setters for customer and other relevant fields
}
