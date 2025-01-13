package com.vehiclesales.car_connect_system.composite;

import java.util.ArrayList;
import java.util.List;

public class CompanyGroup implements CompanyComponent {
    private String name;
    private List<CompanyComponent> subsidiaries = new ArrayList<>();

    public CompanyGroup(String name) {
        this.name = name;
    }

    public void addSubsidiary(CompanyComponent subsidiary) {
        subsidiaries.add(subsidiary);
    }

    @Override
    public void display() {
        System.out.println("Company Group: " + name);
        for (CompanyComponent subsidiary : subsidiaries) {
            subsidiary.display();
        }
    }
}