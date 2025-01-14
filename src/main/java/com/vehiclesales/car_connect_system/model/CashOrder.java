package com.vehiclesales.car_connect_system.model;

public class CashOrder extends Orrder {
    public CashOrder(String orderId, Vehicle vehicle, String status) {
        super(orderId, vehicle, status);
    }

    @Override
    public void processPayment() {
        System.out.println("Processing cash payment for order: " + getOrderId());
    }
}