package com.example.book.services;

import com.example.book.entities.Review;

import java.util.List;

public interface ReviewService {
    List<Review> getReviewsByBookId(Long bookId);
    Review saveReview(Review review);
    void deleteReview(Long reviewId);
    // Optional methods for filtering, moderation, etc.
}
