package com.vehiclesales.car_connect_system.iterator;

import java.util.List;

import com.vehiclesales.car_connect_system.model.Vehicle;

public class VehicleCatalogueImpl implements VehicleCatalogue {
    private List<Vehicle> vehicles;

    public VehicleCatalogueImpl(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public VehicleIterator createIterator() {
        return new VehicleCatalogueIterator(vehicles);
    }
}