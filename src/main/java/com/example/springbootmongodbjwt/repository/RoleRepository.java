package com.example.springbootmongodbjwt.repository;

import com.example.springbootmongodbjwt.models.ERole;
import com.example.springbootmongodbjwt.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
