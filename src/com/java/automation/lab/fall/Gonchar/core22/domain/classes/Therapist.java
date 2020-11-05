package com.java.automation.lab.fall.Gonchar.core22.domain.classes;

public class Therapist extends Doctors {
    private String sertificate;

    public Therapist(String sertificate, String fio, String categoria, String experience, String category,
                        String name, String country) {
        super(name, country, category, fio, categoria, experience);
        this.sertificate = sertificate;
    }

    public String getsertificate() {
        return sertificate;
    }

    public void setsertificate(String sertificate) {
        this.sertificate = sertificate;
    }
}
