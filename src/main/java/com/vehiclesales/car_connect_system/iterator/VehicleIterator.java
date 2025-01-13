package com.vehiclesales.car_connect_system.iterator;

import com.vehiclesales.car_connect_system.model.Vehicle;

public interface VehicleIterator {
    boolean hasNext();
    Vehicle next();
}