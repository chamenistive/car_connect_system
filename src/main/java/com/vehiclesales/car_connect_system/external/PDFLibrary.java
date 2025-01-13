package com.vehiclesales.car_connect_system.external;

public interface PDFLibrary {
    void createPDF(String content);
    void savePDF(String fileName);
}