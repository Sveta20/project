package com.java.automation.lab.fall.Gonchar.core22.domain.classes;

public class Oncologist extends Doctors{
    private String advancedTraining;

    public Oncologist(String advancedTraining, String fio, String categoria, String experience, String category,
                        String name, String country) {
        super(name, country, category, fio, categoria, experience);
        this.advancedTraining = advancedTraining;
    }

    public String getadvancedTraining() {
        return advancedTraining;
    }

    public void setadvancedTraining(String advancedTraining) {
        this.advancedTraining = advancedTraining;
    }
}
