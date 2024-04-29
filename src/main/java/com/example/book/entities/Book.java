package com.example.book.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;


import java.util.Set;

/// Book entity (modified)
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private String genre;
    private String isbn;
    private double price;
    private int quantity; // Book quantity (might not be relevant for carts)

    @ManyToOne // Optional: Many Books can belong to one Cart
    private Cart cart; // Reference back to the Cart this Book belongs to

    // Getters and setters
}
