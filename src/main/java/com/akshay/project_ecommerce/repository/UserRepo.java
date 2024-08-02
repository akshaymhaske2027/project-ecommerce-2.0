package com.akshay.project_ecommerce.repository;

import com.akshay.project_ecommerce.entity.Address;
import com.akshay.project_ecommerce.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
