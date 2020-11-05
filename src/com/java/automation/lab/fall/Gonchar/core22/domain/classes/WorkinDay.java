package com.java.automation.lab.fall.Gonchar.core22.domain.classes;

public class WorkinDay extends Doctors {
    private String day;
    private int hour;

    public WorkinDay(String category, String name, String country, String day, int hour, String fio,
                    String categoria, String experience) {
        super(name, country, category, fio, categoria, experience);
        this.day = day;
        this.hour = hour;
    }

    public String getday() {
        return day;
    }

    public void setday(String day) {
        this.day = day;
    }

    public int gethour() {
        return hour;
    }

    public void sethour (int hour){
        this.hour = hour;
    }
}

