package com.vehiclesales.car_connect_system.template;

import com.vehiclesales.car_connect_system.model.Orrder;

public abstract class OrderCalculator {
    public final double calculateTotal(Orrder order) {
        double subtotal = calculateSubtotal(order);
        double taxes = calculateTaxes(subtotal);
        return subtotal + taxes;
    }

    protected abstract double calculateSubtotal(Orrder order);
    protected abstract double calculateTaxes(double subtotal);
}