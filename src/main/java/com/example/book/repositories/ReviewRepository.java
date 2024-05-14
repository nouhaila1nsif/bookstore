package com.example.book.repositories;

import com.example.book.entities.Orders;
import com.example.book.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long>{
    List<Review> findByBookId(Long bookId);
}