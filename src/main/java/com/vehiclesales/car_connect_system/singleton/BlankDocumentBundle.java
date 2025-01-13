package com.vehiclesales.car_connect_system.singleton;

import com.vehiclesales.car_connect_system.model.DocumentBundle;


public class BlankDocumentBundle {
    private static BlankDocumentBundle instance;
    private DocumentBundle bundle;

    private BlankDocumentBundle() {
        bundle = new DocumentBundle();
        bundle.addDocument("Blank Registration Form");
        bundle.addDocument("Blank Transfer Certificate");
        bundle.addDocument("Blank Order Form");
    }

    public static BlankDocumentBundle getInstance() {
        if (instance == null) {
            instance = new BlankDocumentBundle();
        }
        return instance;
    }

    public DocumentBundle getBundle() {
        return bundle;
    }
}