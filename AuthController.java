package com.example.StyleMatch.controller;
import com.example.StyleMatch.model.User;
import com.example.StyleMatch.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin (origins = "http://127.0.0.1:5500")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login-form")
    public String login(@RequestParam String email, @RequestParam String password) {
        return authService.login(email, password);
    }

    @PostMapping("/register-form")
    public String register(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String gender,
            @RequestParam String password,
            @RequestParam String confirmPassword
    ) {
        if (!password.equals(confirmPassword)) return "Passwords do not match!";
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setGender(gender);
        user.setPassword(password);
        return authService.register(user);
    }

    @PostMapping("/forgot-password")
    public String forgot(@RequestParam String email) {
        return authService.forgotPassword(email);
    }
}


