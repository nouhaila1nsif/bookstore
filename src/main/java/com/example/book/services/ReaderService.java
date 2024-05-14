package com.example.book.services;

import com.example.book.entities.Role;
import com.example.book.entities.User;

import java.util.List;

public interface ReaderService {
    User createUser(String username, String password, String email);
    Role createRole(String newrole);
    void addRoletoUser(String username,String newrole);
    void removeRolefromUser(String username,String newrole);
    User loadUserByUsername(String username);

}

