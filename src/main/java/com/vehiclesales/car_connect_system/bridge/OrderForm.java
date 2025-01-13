package com.vehiclesales.car_connect_system.bridge;


public class OrderForm extends Form {
    public OrderForm(FormRenderer renderer) {
        super(renderer);
    }

    @Override
    public void render() {
        renderer.renderForm("Order Form");
    }
}