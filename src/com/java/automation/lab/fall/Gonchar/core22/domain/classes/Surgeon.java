package com.java.automation.lab.fall.Gonchar.core22.domain.classes;

public class Surgeon extends Doctors {
    private String retraining;

    public Surgeon(String retraining, String fio, String categoria, String experience, String category,
                        String name, String country) {
        super(name, country, category, fio, categoria, experience);
        this.retraining = retraining;
    }

    public String getretraining() {
        return retraining;
    }

    public void setretraining(String retraining) {
        this.retraining = retraining;
    }
}
