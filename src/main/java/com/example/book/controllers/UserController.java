package com.example.book.controllers;

import ch.qos.logback.core.model.Model;
import com.example.book.entities.Customer;
import com.example.book.entities.User;
import com.example.book.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class UserController {

    UserService userService;
    @RequestMapping("/createUser")
    public String createUser(){
        return "createUser";
    }
    @RequestMapping("saveUser")
    public String saveUser(@ModelAttribute("uservue")User userController){
        User saveUser =userService.saveUser(userController);
        return "createUser";
    }




}
