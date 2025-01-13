package com.vehiclesales.car_connect_system.model;

import java.util.ArrayList;
import java.util.List;

public class DocumentBundle {
    private List<String> documents = new ArrayList<>();

    public void addDocument(String document) {
        documents.add(document);
    }
    public List<String> getDocuments() {  // Add this method
        return documents;
    }
    public void printBundle() {
        System.out.println("Document Bundle:");
        for (String doc : documents) {
            System.out.println("- " + doc);
        }
    }
}