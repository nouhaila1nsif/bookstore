package com.example.book.repositories;

import com.example.book.entities.Book;
import com.example.book.entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
    Cart findByCustomerId(Long customerId); // Modified method name

    Cart findByCustomer_Id(Long userId);
}
