package com.example.springtraining.controller;

import com.example.springtraining.exception.ResourceNotFoundException;
import com.example.springtraining.model.User;
import com.example.springtraining.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    //Get All User REST API
    @GetMapping
    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    //Get User by ID REST API
    @GetMapping("{id}")
    public ResponseEntity<User> getUserById(@PathVariable long id) throws ResourceNotFoundException {
        User user = userRepository.findById(id).
                orElseThrow(()->new ResourceNotFoundException("User not exist with id:" + id));
        return ResponseEntity.ok(user);
    }

    //Create User REST API
    @PostMapping()
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }

    //Update User REST API
    @PutMapping("{id}")
    public ResponseEntity<User> updateUser(@PathVariable long id,@RequestBody User userDetails) throws ResourceNotFoundException {
        User updateUser = userRepository.findById(id).
                orElseThrow(()-> new ResourceNotFoundException("User not exist with id:" + id));
        updateUser.setUserName(userDetails.getUserName());
        updateUser.setUserPhoneNo(userDetails.getUserPhoneNo());
        updateUser.setUserAddress(userDetails.getUserAddress());
        updateUser.setUserEmail(userDetails.getUserEmail());
        updateUser.setPassword(userDetails.getPassword());

        userRepository.save(updateUser);
        return ResponseEntity.ok(updateUser);
    }

    //Delete User REST API
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable long id) throws ResourceNotFoundException {
        User user = userRepository.findById(id).
                orElseThrow(()-> new ResourceNotFoundException("User not exist with id:" + id));
        userRepository.delete(user);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

