package com.ds.trade404.controller;

import com.ds.trade404.modal.User;
import com.ds.trade404.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/signup")
    public ResponseEntity<User> register(@RequestBody User user) throws Exception {

        User isEmailExisting = userRepository.findByEmail(user.getEmail());

        if(isEmailExisting != null) {
            throw new Exception("email is already used with another account");
        }

        User newUser = new User();
        newUser.setFullName(user.getFullName());
        newUser.setPassword(user.getPassword());
        newUser.setEmail(user.getEmail());

        User savedUser = userRepository.save(newUser);

        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);

    }
}
