package com.example.book.controllers;

import com.example.book.entities.Role;
import com.example.book.entities.User;
import com.example.book.repositories.RoleRepository;
import com.example.book.repositories.UserRepository;
import com.example.book.services.ReaderService;
import com.example.book.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.BindingResult;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/users") // Définir le chemin de base pour les URLs de cet contrôleur
public class UserController {

    @Autowired
    private ReaderService readerService;

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;

    @Autowired
    private RoleRepository roleRepository;

    @GetMapping("/new")
    public String showAddUserForm(Model model) {
        model.addAttribute("user", new User());
        return "createUser"; // Retourne le nom de la vue Thymeleaf pour créer un utilisateur
    }

    @PostMapping("/add")
    public String addUser(@ModelAttribute("user") User user, @RequestParam("role") String roleName) {
        // Ajouter l'utilisateur
        readerService.createUser(user.getUsername(), user.getPassword(), user.getEmail());

        // Récupérer l'utilisateur nouvellement créé
        User newUser = readerService.loadUserByUsername(user.getUsername());

        if (newUser != null) {
            // Récupérer le rôle par son nom
            Role roleToAdd = roleRepository.findByRole(roleName);

            if (roleToAdd != null) {
                // Ajouter le rôle à l'utilisateur s'il n'est pas déjà associé
                newUser.getRoles().add(roleToAdd);
                userRepository.save(newUser);
            } else {
                throw new RuntimeException("Role not found");
            }
        } else {
            throw new RuntimeException("User not found");
        }

        // Rediriger vers la page d'ajout d'utilisateur après l'ajout
        return "redirect:/users/new";
    }

    @GetMapping("/all")
    public String getAllUsers(Model model) {
        // Récupérer tous les utilisateurs avec leurs rôles depuis la base de données
        List<User> users = userRepository.findAll();

        // Transmettre la liste d'utilisateurs à la vue Thymeleaf
        model.addAttribute("users", users);

        // Retourner le nom de la vue Thymeleaf à afficher
        return "listUser";
    }

    @GetMapping("/edit/{userId}")
    public String showEditUserForm(@PathVariable Long userId, Model model) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("Utilisateur non trouvé"));

        model.addAttribute("user", user);

        List<Role> roles = roleRepository.findAll(); // Récupérer tous les rôles
        model.addAttribute("roles", roles);

        return "edit-user"; // Retourne le nom de la vue Thymeleaf pour la modification d'utilisateur
    }

    @PostMapping("/update")
    public String updateUser(@ModelAttribute("user") @Valid User updatedUser, BindingResult result) {
        if (result.hasErrors()) {
            // Des erreurs de validation sont présentes, retourner vers le formulaire
            return "edit-user";
        }

        // Traitement normal si la validation réussit
        userRepository.save(updatedUser);

        return "redirect:/users/all";
    }
    @GetMapping("/signup")
    public String showSignupForm(Model model) {
        model.addAttribute("user", new User());
        return "signup"; // Nom de la vue Thymeleaf pour le formulaire d'inscription
    }

    @PostMapping("/signup")
    public String processSignupForm(@ModelAttribute("user") User user) {
        // Ajouter ici la logique pour enregistrer l'utilisateur dans la base de données
        userService.saveUser(user);
        return "redirect:/users/signin"; // Redirection vers la page de connexion après l'inscription réussie
    }
    @GetMapping("/signin")
    public String showSigninForm() {
        return "signin"; // Nom de la vue Thymeleaf pour le formulaire de connexion
    }

    @PostMapping("/delete/{userId}")
    public String deleteUser(@PathVariable Long userId) {
        // Supprimer l'utilisateur de la base de données
        userRepository.deleteById(userId);

        return "redirect:/users/all"; // Rediriger vers la liste mise à jour des utilisateurs
    }
}
