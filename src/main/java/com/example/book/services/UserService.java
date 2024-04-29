package com.example.book.services;

import com.example.book.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User registerUser(User user);

    User getUserByUsername(String username);

    List<User> getAllUsers();
    Optional<User> getUserById(Long id);
    User saveUser(User user);
    void deleteUser(Long id);
}
