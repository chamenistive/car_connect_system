package com.vehiclesales.car_connect_system.external;

public class PDFBoxLibrary implements PDFLibrary {
    @Override
    public void createPDF(String content) {
        System.out.println("Creating PDF with content: " + content);
    }

    @Override
    public void savePDF(String fileName) {
        System.out.println("Saving PDF as: " + fileName);
    }
}