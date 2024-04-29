package com.example.book.services;

import com.example.book.entities.Order;
import com.example.book.entities.Payment;

import java.util.List;
import java.util.Optional;

public interface PaymentService {
    Payment createPayment(Order order, String paymentMethod, double amount);
    List<Payment> getAllPayments();
    Optional<Payment> getPaymentById(Long id);
}