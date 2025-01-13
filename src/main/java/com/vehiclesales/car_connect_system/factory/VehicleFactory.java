package com.vehiclesales.car_connect_system.factory;

import com.vehiclesales.car_connect_system.model.Vehicle;

public interface VehicleFactory {
    Vehicle createCar(String model, double price);
    Vehicle createScooter(String model, double price);
}