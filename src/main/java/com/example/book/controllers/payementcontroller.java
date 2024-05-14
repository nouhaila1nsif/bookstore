package com.example.book.controllers;

import com.example.book.entities.Payment;
import com.example.book.repositories.PaymentRepository;
import com.example.book.services.PaymentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@AllArgsConstructor

@Controller

public class payementcontroller {

    @Autowired
    private PaymentRepository paymentRepository;
    private final PaymentService paymentService;

    // Mapping pour afficher la liste des paiements
    @GetMapping("/payement")
    public String payement(ModelMap model) {
        // Récupérer tous les paiements depuis la base de données
        List<Payment> payement = paymentService.getAllPayments();

        // Ajouter la liste des paiements au modèle pour l'affichage dans la vue
        model.addAttribute("payement", payement);

        // Retourner le nom de la vue HTML à afficher (payments.html)
        return "payement";
    }
}
