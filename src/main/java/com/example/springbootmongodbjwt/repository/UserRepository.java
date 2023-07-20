package com.example.springbootmongodbjwt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

import com.example.springbootmongodbjwt.models.User;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
