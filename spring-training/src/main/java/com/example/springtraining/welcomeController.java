package com.example.springtraining;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {
    @GetMapping("/welcome")
    public String welcome(){
        return "hi ajay";
    }
}
