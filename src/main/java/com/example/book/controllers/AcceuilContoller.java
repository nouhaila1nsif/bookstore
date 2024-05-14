package com.example.book.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@AllArgsConstructor
@RequestMapping("/")
public class AcceuilContoller {
    @GetMapping("/acceuil")
    public String acceuil() {
        return "acceuil";
    }
}
