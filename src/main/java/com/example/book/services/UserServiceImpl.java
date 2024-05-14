package com.example.book.services;

import com.example.book.entities.User;
import com.example.book.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User registerUser(User user) {
        // Implémentation de l'enregistrement d'un nouvel utilisateur
        return userRepository.save(user);
    }


    @Override
    public User getUserByUsername(String username) {
        // Implémentation de la récupération d'un utilisateur par nom d'utilisateur
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> getAllUsers() {
        // Implémentation de la récupération de tous les utilisateurs
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUserById(Long id) {
        // Implémentation de la récupération d'un utilisateur par ID
        return userRepository.findById(id);
    }

    @Override
    public User saveUser(User user) {
        // Implémentation de l'enregistrement ou de la mise à jour d'un utilisateur
        return userRepository.save(user);
    }
    public void signIn(User user) {
        // You can implement sign-in logic here if needed
        System.out.println("User signed in: " + user.getUsername());
    }
    public void signUp(User user) {
        // Save the user to the database
        userRepository.save(user);
        System.out.println("User signed up: " + user.getUsername());
    }


    @Override
    public void deleteUser(Long id) {
        // Implémentation de la suppression d'un utilisateur par ID
        userRepository.deleteById(id);
    }
}
