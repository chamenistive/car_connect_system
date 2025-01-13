package com.vehiclesales.car_connect_system.bridge;


public abstract class Form {
    protected FormRenderer renderer;

    public Form(FormRenderer renderer) {
        this.renderer = renderer;
    }

    public abstract void render();
}