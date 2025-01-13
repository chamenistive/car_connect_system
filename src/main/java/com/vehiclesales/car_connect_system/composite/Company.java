package com.vehiclesales.car_connect_system.composite;


public class Company implements CompanyComponent {
    private String name;

    public Company(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Company: " + name);
    }
}