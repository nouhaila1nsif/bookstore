package com.example.book.services;

import com.example.book.entities.SecurityConfiguration;
import com.example.book.repositories.SecurityConfigurationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SecurityServiceImpl implements SecurityService {

    @Autowired
    private SecurityConfigurationRepository securityConfigurationRepository;

    @Override
    public SecurityConfiguration getSecurityConfiguration() {
        return securityConfigurationRepository.findById(1L).orElse(null); // Assuming a single configuration with ID 1
    }

    // Implement additional methods based on your security service needs
}
