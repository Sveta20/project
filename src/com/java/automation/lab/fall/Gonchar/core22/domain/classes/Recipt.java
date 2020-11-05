package com.java.automation.lab.fall.Gonchar.core22.domain.classes;

import com.java.automation.lab.fall.Gonchar.core22.domain.interfaces.IType;

public abstract class Recipt extends Patient implements IType {
    private String denomination;
    private String doctor;

    public Recipt(String nameDoctor, String namePatient, int age, String denomination, String doctor,
                     String nameofDoctor, String weekday) {
        super(nameDoctor, namePatient, age, nameofDoctor, weekday);
        this.denomination = denomination;
        this.doctor = doctor;
    }

    public String getdenomination() {
        return denomination;
    }

    public void setdenomination(String denomination) {
        this.denomination = denomination;
    }

    public String getdoctor() {
        return doctor;
    }

    public void setdoctor(String doctor) {
        this.doctor = doctor;
    }

    public void type(int m) {
        if (m==preferential)
            System.out.println("Recip is preferential");
        else if (m==total)
            System.out.println("Recip ia total");
        else
            System.out.println("State is invalid");
    }
}
