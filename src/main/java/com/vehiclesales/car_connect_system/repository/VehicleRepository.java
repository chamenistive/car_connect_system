package com.vehiclesales.car_connect_system.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.vehiclesales.car_connect_system.model.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}