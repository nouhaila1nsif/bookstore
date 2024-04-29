package com.example.book.services;

import com.example.book.entities.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    List<Order> getAllOrders();
    Optional<Order> getOrderById(Long id);
    Order saveOrder(Order order);

    Order createOrder(Order order);

    Order updateOrder(Long id, Order updatedOrder);

    void deleteOrder(Long id);
}
