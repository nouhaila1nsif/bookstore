package com.example.book.services;
import com.example.book.entities.Orders;
import com.example.book.entities.Payment;
import com.example.book.enums.PaymentMethod;


import java.util.List;
import java.util.Optional;

public interface PaymentService {
    Payment createPayment(Orders order, PaymentMethod paymentMethod, double amount);
    List<Payment> getAllPayments();
    Optional<Payment> getPaymentById(Long id);
}