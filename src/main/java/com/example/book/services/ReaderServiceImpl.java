package com.example.book.services;

import com.example.book.entities.Role;
import com.example.book.entities.User;
import com.example.book.repositories.RoleRepository;
import com.example.book.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service

public class ReaderServiceImpl implements ReaderService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public User createUser(String username, String password, String email) {
       /* User newUser = new User();

        newUser.setUsername(username);
        newUser.setPassword(password); // You should handle password encryption/hashing here
        newUser.setEmail(email);
        return userRepository.save(newUser);*/

        /*User user1 = User.builder()
                .id(UUID.randomUUID().toString())
                .username(username)
                .password(bCryptPasswordEncoder.encode(password))
                .email(email)
                .build();*/
        User user1 = userRepository.findByUsername(username);

        if (user1 != null) {
            throw new RuntimeException("User already exists");
        }


        user1 = User.builder()
                .username(username)
                .password(bCryptPasswordEncoder.encode(password))
                .email(email)
                .build();

        return userRepository.save(user1);


    }


    @Override
    public Role createRole(String newrole) {
        Role existingRole = roleRepository.findByRole(newrole);
        if (existingRole != null) throw new RuntimeException("Le rôle existe déjà");
        existingRole = Role.builder()
                .role(newrole)
                .build();

        return roleRepository.save(existingRole);
    }

    @Override
    public void addRoletoUser(String username, String roleName) {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new RuntimeException("User not found: " + username);
        }

        Role role = roleRepository.findByRole(roleName);
        if (role == null) {
            throw new RuntimeException("Role not found: " + roleName);
        }

        // Ajouter le rôle à l'utilisateur seulement si l'utilisateur et le rôle existent
        if (!user.getRoles().contains(role)) {
            user.getRoles().add(role);
            userRepository.save(user);
        }
    }

    @Override
    public void removeRolefromUser(String username, String roleName) {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new RuntimeException("User not found: " + username);
        }

        Role role = roleRepository.findByRole(roleName);
        if (role == null) {
            throw new RuntimeException("Role not found: " + roleName);
        }

        // Supprimer le rôle de l'utilisateur seulement si l'utilisateur et le rôle existent
        if (user.getRoles().contains(role)) {
            user.getRoles().remove(role);
            userRepository.save(user);
        }
    }


    @Override
    public User loadUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}