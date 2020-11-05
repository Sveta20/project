package com.java.automation.lab.fall.Gonchar.core22.domain.classes;

public class Coordination extends Department{
    private String equipment;

    public Coordination(String equipment, String category, String name, String country) {
        super(name, country, category);
        this.equipment = equipment;
    }

    public String getequipment() {
        return equipment;
    }

    public void setequipment(String equipment) {
        this.equipment = equipment;
    }
}
