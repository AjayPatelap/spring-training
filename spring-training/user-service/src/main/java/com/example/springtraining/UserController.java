package com.example.springtraining;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/welcome")
    public String welcome(){
        return "Hello world.";
    }
}
