package com.vehiclesales.car_connect_system.decorator;

import com.vehiclesales.car_connect_system.model.Vehicle;

public abstract class VehicleDecorator extends Vehicle {
    protected Vehicle vehicle;

    public VehicleDecorator(Vehicle vehicle) {
        super(vehicle.getType(), vehicle.getModel(), vehicle.getPrice(), vehicle.getFuelType());
        this.vehicle = vehicle;
    }

    @Override
    public abstract void display();
}