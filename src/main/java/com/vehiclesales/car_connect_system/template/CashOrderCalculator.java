package com.vehiclesales.car_connect_system.template;

import com.vehiclesales.car_connect_system.model.Orrder;

public class CashOrderCalculator extends OrderCalculator {
    @Override
    protected double calculateSubtotal(Orrder order) {
        return order.getVehicle().getPrice();
    }

    @Override
    protected double calculateTaxes(double subtotal) {
        return subtotal * 0.10; // 10% tax
    }
}