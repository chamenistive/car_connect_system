package com.vehiclesales.car_connect_system.model;


// import jakarta.persistence.*;

public abstract class Vehicle {
    private String type;
    private String model;
    private double price;
    private String fuelType;

    // Constructor, getters, and setters
    public Vehicle(String type, String model, double price, String fuelType) {
        this.type = type;
        this.model = model;
        this.price = price;
        this.fuelType = fuelType;
    }

  // Getters and setters
  public String getType() {
    return type;
}

public String getModel() {
    return model;
}

public double getPrice() {
    return price;
}

public String getFuelType() {
    return fuelType;
}

// Display method
public void display() {
    System.out.println(toString());
}

@Override
public String toString() {
    return type + " - " + model + " (" + fuelType + ") - $" + price;
    }
}