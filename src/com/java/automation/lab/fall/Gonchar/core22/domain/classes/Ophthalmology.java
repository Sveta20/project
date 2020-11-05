package com.java.automation.lab.fall.Gonchar.core22.domain.classes;

public class Ophthalmology extends Department {
    private String disease;

    public Ophthalmology(String disease, String category, String name, String country) {
        super (category, name, country);
        this.disease = disease;
    }

    public String getdisease() {
        return disease;
    }

    public void setdisease(String disease) {
        this.disease = disease;
    }
}
