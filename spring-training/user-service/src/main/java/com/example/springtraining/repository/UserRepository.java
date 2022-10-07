package com.example.springtraining.repository;

import com.example.springtraining.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
