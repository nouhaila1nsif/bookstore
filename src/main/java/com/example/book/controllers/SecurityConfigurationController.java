package com.example.book.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityConfigurationController {
    @GetMapping("/")
    public String home(){
        return "redirect:/books/home";
    }


}
