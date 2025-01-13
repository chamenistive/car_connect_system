package com.vehiclesales.car_connect_system.decorator;

import com.vehiclesales.car_connect_system.model.Vehicle;

public class VehicleAnimationDecorator extends VehicleDecorator {
    public VehicleAnimationDecorator(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void display() {
        vehicle.display();
        System.out.println("Displaying 3D animation for: " + vehicle.getModel());
    }
}
