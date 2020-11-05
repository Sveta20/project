package com.java.automation.lab.fall.Gonchar.core22.domain.classes;

public class Therapeutic extends Department {
    private String vid;

    public Therapeutic(String vid, String category, String name, String country) {
        super (category, name, country);
        this.vid = vid;
    }

    public String getvid() {
        return vid;
    }

    public void setvid(String vid) {
        this.vid = vid;
    }
}
