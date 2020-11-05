package com.java.automation.lab.fall.Gonchar.core22.domain.classes;

public class Records extends Diagnosis {
    private String complaints;
    private String purpose;

    public Records(String nameDoctor, String namePatient, int age, String complaints, String purpose,
                   String nameofDoctor, String weekday, String name) {
        super(nameDoctor, namePatient, age, nameofDoctor, weekday, name);
        this.complaints = complaints;
        this.purpose = purpose;
    }

    public String getcomplaints() {
        return complaints;
    }

    public void setcomplaints(String complaints) {
        this.complaints = complaints;
    }

    public String getpurpose() {
        return purpose;
    }

    public void setpurpose(String purpose) {
        this.purpose = purpose;
    }
}
