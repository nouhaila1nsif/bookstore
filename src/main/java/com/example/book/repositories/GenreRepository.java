package com.example.book.repositories;


import com.example.book.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface GenreRepository extends JpaRepository<Genre, Long> {
    // ... (Optional additional methods)
}