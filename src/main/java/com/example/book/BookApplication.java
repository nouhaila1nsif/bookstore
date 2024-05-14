package com.example.book;

import com.example.book.services.ReaderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class, args);
    }
   // @Bean
    public CommandLineRunner commandLineRunner(ReaderService readerService) {
        return args -> {
            /*readerService.createUser("admin", "123", "admin@gmail.com");
            readerService.createRole("ADMIN");
            readerService.createRole("USER");
            readerService.createUser("user", "123", "user@gmail.com");
            readerService.addRoletoUser("admin","ADMIN");
            readerService.addRoletoUser("user","USER");
            readerService.addRoletoUser("admin","USER");*/






        };
    }
}
