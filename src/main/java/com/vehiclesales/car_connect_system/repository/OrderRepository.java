package com.vehiclesales.car_connect_system.repository;

import com.vehiclesales.car_connect_system.model.Orrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Orrder, Long> {
    // No need to implement the save method; it's provided by JpaRepository
}