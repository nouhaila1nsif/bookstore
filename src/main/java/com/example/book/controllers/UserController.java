package com.example.book.controllers;

import ch.qos.logback.core.model.Model;
import com.example.book.entities.User;
import com.example.book.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users") // Assuming a GET request to "/users"
    public String getAllUsers(Model model) {
        List<User> users = userService.getAllUsers(); // Get all users
        model.addText("users"); // Add users to the model
        return "user"; // Return the template name
    }
}
