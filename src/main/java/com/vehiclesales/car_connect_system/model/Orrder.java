package com.vehiclesales.car_connect_system.model;

public abstract class Orrder {
    private String orderId;
    private Vehicle vehicle;
    private String status;

    public Orrder(String orderId, Vehicle vehicle, String status) {
        this.orderId = orderId;
        this.vehicle = vehicle;
        this.status = status;
    }

    // getters and setters
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public abstract void processPayment();

    @Override
    public String toString() {
        return "Order ID: " + orderId + ", Vehicle: " + vehicle + ", Status: " + status;
    }
}