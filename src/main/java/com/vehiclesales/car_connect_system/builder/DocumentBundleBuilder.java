package com.vehiclesales.car_connect_system.builder;

import com.vehiclesales.car_connect_system.model.DocumentBundle;

public interface DocumentBundleBuilder {
    void addRegistrationForm();
    void addTransferCertificate();
    void addOrderForm();
    DocumentBundle getBundle();
}