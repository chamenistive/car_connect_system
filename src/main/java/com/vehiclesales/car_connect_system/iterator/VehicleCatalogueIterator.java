package com.vehiclesales.car_connect_system.iterator;

import java.util.List;

import com.vehiclesales.car_connect_system.model.Vehicle;

public class VehicleCatalogueIterator implements VehicleIterator {
    private List<Vehicle> vehicles;
    private int position = 0;

    public VehicleCatalogueIterator(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public boolean hasNext() {
        return position < vehicles.size();
    }

    @Override
    public Vehicle next() {
        if (hasNext()) {
            return vehicles.get(position++);
        }
        return null;
    }
}