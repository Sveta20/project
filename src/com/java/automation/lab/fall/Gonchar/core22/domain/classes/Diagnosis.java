package com.java.automation.lab.fall.Gonchar.core22.domain.classes;

public class Diagnosis extends Patient {
    private String name;

    public Diagnosis(String nameDoctor, String namePatient, int age, String name, String nameofDoctor, String weekday) {
        super(nameDoctor, namePatient, age, nameofDoctor, weekday);
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }
}
