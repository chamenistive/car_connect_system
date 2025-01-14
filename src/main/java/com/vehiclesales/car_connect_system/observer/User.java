package com.vehiclesales.car_connect_system.observer;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received update: " + message);
    }

    // public static Object withDefaultPasswordEncoder() {
    //     throw new UnsupportedOperationException("Unimplemented method 'withDefaultPasswordEncoder'");
    // }
}