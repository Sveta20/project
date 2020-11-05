package com.java.automation.lab.fall.Gonchar.core22.domain.classes;

import com.java.automation.lab.fall.Gonchar.core22.domain.enums.Schedule;

public class Doctors extends Department {
    private String fio;
    private String categoria;
    private String experience;

    public Doctors(String fio, String categoria, String experience, String category, String name, String country) {
        super(name, country, category);
        this.fio = fio;
        this.categoria = categoria;
        this.experience = experience;
    }

    public String getfio() {
        return fio;
    }

    public void setfio(String fio) {
        this.fio = fio;
    }

    public String getcategoria() {
        return categoria;
    }

    public void setcategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getexperience() {
        return experience;
    }

    public void setexperience(String experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return super.toString() + "Schedule:" + descripSchedule;
    }

}
