package com.java.automation.lab.fall.Gonchar.core22.domain.classes;

public class Hospital {
    private String name;
    private String country;

    public Hospital(String name, String country) {
        this.country = country;
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getcountry() {
        return country;
    }

    public void setcountry(String country) {
        this.country = country;
    }
}
