package com.hillel.application.presentation.controller;

import com.hillel.application.persistent.entity.Role;
import com.hillel.application.persistent.entity.User;
import com.hillel.application.presentation.model.UserInfo;
import com.hillel.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
public class Login {

    @Autowired
    private UserService service;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String name, @RequestParam String password) {
        Optional<User> byUserNameAndPassword = service.findByUsernameAndPassword(name, password);

        if (byUserNameAndPassword.isPresent()) {
            User user = byUserNameAndPassword.get();
            user.setToken(UUID.randomUUID().toString());
            user.setExpirationDate(LocalDateTime.now().plusDays(1));
            service.save(user);

            return ResponseEntity.ok("Successfully login to application. You authenticated token: {" + user.getToken() + "}");
        }

        return ResponseEntity.badRequest().body("Error: login or password is not valid");
    }

    @PostMapping("/addNewUser")
    public ResponseEntity<String> addNewUser(@RequestBody UserInfo userInfo) {
        User user = new User();
        user.setUsername(userInfo.getName());
        user.setPassword(userInfo.getPassword());
        user.setAuthorities(userInfo.getRoles().stream().map(Role::new).collect(Collectors.toList()));
        service.save(user);

        return ResponseEntity.ok("User successfully created");
    }

    @GetMapping("/authenticated")
    public ResponseEntity<String> authenticated() {
        String s = "You are successfully authenticated with the following credentials and will receive our full support";

        return ResponseEntity.ok(s);
    }
}
