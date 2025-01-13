package com.vehiclesales.car_connect_system.factory;

import com.vehiclesales.car_connect_system.model.Car;
import com.vehiclesales.car_connect_system.model.Scooter;
import com.vehiclesales.car_connect_system.model.Vehicle;

public class ElectricVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle createCar(String model, double price) {
        return new Car(model, price, "Electric");
    }

    @Override
    public Vehicle createScooter(String model, double price) {
        return new Scooter(model, price, "Electric");
    }
}