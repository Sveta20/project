package com.java.automation.lab.fall.Gonchar.core22.domain.classes;

public class Surgecy extends Department {
    private String cases;
    private String equipment;

    public Surgecy(String equipment, String cases, String category, String name, String country) {
        super(name, country, category);
        this.equipment = equipment;
        this.cases = cases;
    }

    public String getequipment() {
        return equipment;
    }

    public void setequipment(String equipment) {
        this.equipment = equipment;
    }

    public String getcases() {
        return cases;
    }

    public void setcases(String cases) {
        this.cases = cases;
    }
}
