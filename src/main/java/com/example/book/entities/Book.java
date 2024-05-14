package com.example.book.entities;

import com.example.book.entities.Cart;
import com.example.book.entities.Review;
import com.example.book.enums.Genre;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.validator.constraints.URL;


import java.util.Set;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Title is required")
    private String title;

    @NotBlank(message = "Author is required")
    private String author;

    @PositiveOrZero(message = "Publication year must be a positive number")
    private int publicationYear;

    private String language;

    @URL(message = "Invalid URL format for cover image")
    private String coverImage;

    @NotBlank(message = "Description is required")
    private String description;

    @NotBlank(message = "Content is required")
    private String content;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private Set<Review> reviews;


    @ManyToOne
    private Cart cart;
}
