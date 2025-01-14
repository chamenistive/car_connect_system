// package com.vehiclesales.car_connect_system.model;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;

// @Entity
// public abstract class Orrder {
//     private String orderId;
//     private Vehicle vehicle;
//     private String status;

//     public Orrder(String orderId, Vehicle vehicle, String status) {
//         this.orderId = orderId;
//         this.vehicle = vehicle;
//         this.status = status;
//     }

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;
//     // getters and setters
//     public String getOrderId() {
//         return orderId;
//     }

//     public void setOrderId(String orderId) {
//         this.orderId = orderId;
//     }

//     public Vehicle getVehicle() {
//         return vehicle;
//     }

//     public void setVehicle(Vehicle vehicle) {
//         this.vehicle = vehicle;
//     }

//     public String getStatus() {
//         return status;
//     }

//     public void setStatus(String status) {
//         this.status = status;
//     }

//     public abstract void processPayment();

//     @Override
//     public String toString() {
//         return "Order ID: " + orderId + ", Vehicle: " + vehicle + ", Status: " + status;
//     }
// }
package com.vehiclesales.car_connect_system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public abstract class Orrder {

    // private String orderId;
    // private Vehicle vehicle;
    // private String status;

    // Define the constructor
    public Orrder(String orderId, Vehicle vehicle, String status) {
        this.orderId = orderId;
        this.vehicle = vehicle;
        this.status = status;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderId;
    private String status;

    @ManyToOne
    private Vehicle vehicle;

    public abstract void processPayment();

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}