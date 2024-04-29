package com.example.book.services;

import com.example.book.entities.Cart;
import com.example.book.entities.Customer;
import com.example.book.repositories.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;


    @Override
    public Cart getCartByUserId(Long userId) {
        return cartRepository.findByCustomer_Id(userId);
    }

    @Override
    public void addItemToCart(Long userId, Long bookId, int quantity) {
            Cart cart = cartRepository.findByCustomer_Id(userId);
            if (cart == null) {
                cart = new Cart();
                cart.setCustomer(new Customer(userId)); // Assuming you have a way to get the customer object
            }
    }

    @Override
    public Cart removeItemFromCart(Long userId, Long bookId) {
        // Implement logic to remove item from cart
        return null;
    }

    @Override
    public void clearCart(Long userId) {
        // Implement logic to clear cart
    }
}
