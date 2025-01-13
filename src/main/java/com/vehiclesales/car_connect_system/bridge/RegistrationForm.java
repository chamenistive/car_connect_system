package com.vehiclesales.car_connect_system.bridge;


public class RegistrationForm extends Form {
    public RegistrationForm(FormRenderer renderer) {
        super(renderer);
    }

    @Override
    public void render() {
        renderer.renderForm("Registration Form");
    }
}