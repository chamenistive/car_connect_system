package com.vehiclesales.car_connect_system.bridge;


public class HTMLFormRenderer implements FormRenderer {
    @Override
    public void renderForm(String formName) {
        System.out.println("Rendering " + formName + " as HTML form.");
    }
}
