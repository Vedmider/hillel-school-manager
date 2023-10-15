package com.hillel.application.service;

import com.hillel.application.persistent.entity.User;
import com.hillel.application.persistent.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userDetailsService.loadUserByUsername(username);
    }

    @Override
    public Optional<? extends UserDetails> findByToken(String token) {
        return userRepository.findByToken(token);
    }

    @Override
    public Optional<User> findByUsernameAndPassword(String name, String password) {
        return userRepository.findByUsernameAndPassword(name, password);
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
