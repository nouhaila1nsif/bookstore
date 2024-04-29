package com.example.book.repositories;

import com.example.book.entities.SecurityConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecurityConfigurationRepository extends JpaRepository<SecurityConfiguration, Long> {
}
