package com.example.book.entities;
import org.springframework.http.HttpMethod;
import org.springframework.security.core.userdetails.User;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.book.controllers.BookController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
public class SecurityConfiguration {

    @Bean
    BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {

        return httpSecurity
                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults())

                .authorizeHttpRequests(authCustomizer ->authCustomizer.requestMatchers("/books/showBookDetails","/books/home","/books/added").hasAnyRole("ADMIN","USER")
                        .requestMatchers("/books/create","books/edit","/books/update","/books/delete","/books/added","/books/saveBook","/books","/createCustomer","books/create","/users/new","/users/add","/users","/users/add","users/all","/users/edit","users/update").hasRole("ADMIN")
                                .requestMatchers("/acceuil","/users/signin","/users/signup").permitAll()
                                .anyRequest().authenticated()

                        )
               /*.formLogin(
                        formLogin ->
                                formLogin.loginPage("/books/acceuil").defaultSuccessUrl("/")
                )*/
               // .exceptionHandling(e->e.accessDeniedPage("/books/home"))
                .build();
    }

    //@Bean
    /*public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
        return new InMemoryUserDetailsManager(
                User.withUsername("admin").password(bCryptPasswordEncoder().encode("123")).roles("ADMIN").build(),
                User.withUsername("user").password(bCryptPasswordEncoder().encode("123")).roles("USER").build()

        )



    }*/
}
