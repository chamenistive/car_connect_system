package com.vehiclesales.car_connect_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehiclesales.car_connect_system.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}