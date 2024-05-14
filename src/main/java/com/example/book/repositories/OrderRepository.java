package com.example.book.repositories;

import com.example.book.entities.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Long> {
    List<Orders> findByOrderDateBetween(LocalDate startDate, LocalDate endDate);
    // You can add custom query methods here if needed
}
