package com.vehiclesales.car_connect_system.builder;

import com.vehiclesales.car_connect_system.model.DocumentBundle;

public class PDFDocumentBundleBuilder implements DocumentBundleBuilder {
    private DocumentBundle bundle = new DocumentBundle();

    @Override
    public void addRegistrationForm() {
        bundle.addDocument("PDF Registration Form");
    }

    @Override
    public void addTransferCertificate() {
        bundle.addDocument("PDF Transfer Certificate");
    }

    @Override
    public void addOrderForm() {
        bundle.addDocument("PDF Order Form");
    }

    @Override
    public DocumentBundle getBundle() {
        return bundle;
    }
}