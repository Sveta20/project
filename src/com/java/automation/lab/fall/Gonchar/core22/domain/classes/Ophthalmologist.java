package com.java.automation.lab.fall.Gonchar.core22.domain.classes;

public class Ophthalmologist extends Doctors{
    private String specialization;

    public Ophthalmologist(String specialization, String fio, String categoria, String experience,
                           String category, String name, String country) {
        super(name, country, category, fio, categoria, experience);
        this.specialization = specialization;
    }

    public String getspecialization() {
        return specialization;
    }

    public void setspecialization(String specialization) {
        this.specialization = specialization;
    }
}
