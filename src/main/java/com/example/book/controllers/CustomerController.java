package com.example.book.controllers;

import com.example.book.services.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class CustomerController {
     CustomerService customerService;
    @RequestMapping("/createCustomer")
    public String createCustomer(){
        return "CreateCustomer";
    }

}
