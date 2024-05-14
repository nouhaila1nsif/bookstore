package com.example.book.services;

import com.example.book.entities.Orders;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    List<Orders> getAllOrders();
    Optional<Orders> getOrderById(Long id);
    Orders saveOrder(Orders order);

    Orders createOrder(Orders order);

    Orders updateOrder(Long id, Orders updatedOrder);

    void deleteOrder(Long id);
}
