package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class ProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectApplication.class, args);
    
    }
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("mainMessage", "Welcome to My Awesome World!");
        model.addAttribute("subMessage", "Explore the wonders of web development");
        return "home";  // Add this semicolon
    }
    
}