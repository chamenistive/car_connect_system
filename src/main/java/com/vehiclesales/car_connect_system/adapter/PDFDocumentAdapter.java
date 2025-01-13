package com.vehiclesales.car_connect_system.adapter;

import com.vehiclesales.car_connect_system.external.PDFLibrary;
import com.vehiclesales.car_connect_system.model.DocumentBundle;

public class PDFDocumentAdapter {
    private PDFLibrary pdfLibrary;

    public PDFDocumentAdapter(PDFLibrary pdfLibrary) {
        this.pdfLibrary = pdfLibrary;
    }

    public void createAndSavePDF(DocumentBundle bundle, String fileName) {
        StringBuilder content = new StringBuilder();
        for (String doc : bundle.getDocuments()) {
            content.append(doc).append("\n");
        }
        pdfLibrary.createPDF(content.toString());
        pdfLibrary.savePDF(fileName);
    }
}