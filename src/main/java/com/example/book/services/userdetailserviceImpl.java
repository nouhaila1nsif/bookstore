package com.example.book.services;

import com.example.book.entities.Role;
import com.example.book.entities.User;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class userdetailserviceImpl implements UserDetailsService {
    private ReaderService readerService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=readerService.loadUserByUsername(username);
        if(user==null) throw new UsernameNotFoundException("user not found");

        return org.springframework.security.core.userdetails.User
                .withUsername(user.getUsername())
                .password(user.getPassword())
                .roles(user.getRoles().stream().map(Role::getRole).toArray(String[]::new)).build();
    }
}
