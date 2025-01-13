package com.vehiclesales.car_connect_system.bridge;


public class WidgetFormRenderer implements FormRenderer {
    @Override
    public void renderForm(String formName) {
        System.out.println("Rendering " + formName + " as a widget.");
    }
}