package com.example.StyleMatch.service;

import com.example.StyleMatch.model.User;
import com.example.StyleMatch.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional; // <-- This is the missing import

@Service
public class AuthService {
    @Autowired
    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String register(User user) {
        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            return "Email already registered!";
        }
        userRepository.save(user);
        return "Registration successful!";
    }

    public String login(String email, String password) {
        Optional<User> user = userRepository.findByEmail(email);
        return user.map(u -> u.getPassword().equals(password) ? "Login successful!" : "Invalid password")
                .orElse("User not found");
    }

    public String forgotPassword(String email) {
        return userRepository.findByEmail(email).isPresent() ?
                "Reset link sent to: " + email : "Email not registered!";
    }
}
