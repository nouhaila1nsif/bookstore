package com.example.book.services;

import com.example.book.entities.Cart;


public interface CartService {
    Cart getCartByUserId(Long userId);
    void addItemToCart(Long userId, Long bookId, int quantity);
    Cart removeItemFromCart(Long userId, Long bookId);
    void clearCart(Long userId);
}
