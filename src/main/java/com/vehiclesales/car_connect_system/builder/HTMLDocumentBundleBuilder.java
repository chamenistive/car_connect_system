package com.vehiclesales.car_connect_system.builder;

import com.vehiclesales.car_connect_system.model.DocumentBundle;


public class HTMLDocumentBundleBuilder implements DocumentBundleBuilder {
    private DocumentBundle bundle = new DocumentBundle();

    @Override
    public void addRegistrationForm() {
        bundle.addDocument("HTML Registration Form");
    }

    @Override
    public void addTransferCertificate() {
        bundle.addDocument("HTML Transfer Certificate");
    }

    @Override
    public void addOrderForm() {
        bundle.addDocument("HTML Order Form");
    }

    @Override
    public DocumentBundle getBundle() {
        return bundle;
    }
}