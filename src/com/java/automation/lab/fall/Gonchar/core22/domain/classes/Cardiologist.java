package com.java.automation.lab.fall.Gonchar.core22.domain.classes;

public class Cardiologist extends Doctors {
    private String scientificActivity;

    public Cardiologist(String scientificActivity, String fio, String categoria, String experience, String category,
                        String name, String country) {
        super(name, country, category, fio, categoria, experience);
        this.scientificActivity = scientificActivity;
    }

    public String getscientificActivity() {
        return scientificActivity;
    }

    public void setscientificActivity(String scientificActivity) {
        this.scientificActivity = scientificActivity;
    }
}
