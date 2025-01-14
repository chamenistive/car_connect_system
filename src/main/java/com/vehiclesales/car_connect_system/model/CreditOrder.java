package com.vehiclesales.car_connect_system.model;

public class CreditOrder extends Orrder {
    public CreditOrder(String orderId, Vehicle vehicle, String status) {
        super(orderId, vehicle, status);
    }

    @Override
    public void processPayment() {
        System.out.println("Processing credit payment for order: " + getOrderId());
    }
}