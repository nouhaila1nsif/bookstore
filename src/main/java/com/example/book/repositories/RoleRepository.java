package com.example.book.repositories;


import com.example.book.entities.Role;
import com.example.book.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRole(String role);
    @Query("SELECT r.role FROM Role r")
    List<String> findAllRoles();
    List<Role> findByRoleIn(List<String> roleNames);


}