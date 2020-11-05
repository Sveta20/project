package com.java.automation.lab.fall.Gonchar.core22.domain.classes;

import com.java.automation.lab.fall.Gonchar.core22.domain.interfaces.IKind;

public class SickLeave extends Diagnosis implements IKind {
    private String nameP;
    private String gender;
    private String diagnosis;

    public SickLeave(String nameDoctor, String namePatient, int age, String nameP, String gender,
                     String diagnosis, String nameofDoctor, String weekday, String name) {
        super(nameDoctor, namePatient, age, nameofDoctor, weekday, name);
        this.nameP = nameP;
        this.gender = gender;
        this.diagnosis = diagnosis;
    }

    public String getnameP() {
        return nameP;
    }

    public void setnameP(String nameP) {
        this.nameP = nameP;
    }

    public String getgender() {
        return gender;
    }

    public void setgender(String gender) {
        this.gender = gender;
    }

    public String getdiagnosis() {
        return diagnosis;
    }

    public void setdiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

}
