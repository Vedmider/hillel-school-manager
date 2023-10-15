package com.hillel.application.service;

import com.hillel.application.persistent.entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

public interface UserService {

    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

    Optional<? extends UserDetails> findByToken(String token);

    Optional<User> findByUsernameAndPassword(String name, String password);

    void save(User user);
}
