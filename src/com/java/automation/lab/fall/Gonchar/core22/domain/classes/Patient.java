package com.java.automation.lab.fall.Gonchar.core22.domain.classes;

public class Patient extends AppointmentCard {
    private String namePatient;
    private String nameDoctor;
    private int age;

    public Patient(String nameDoctor, String namePatient, int age, String nameofDoctor, String weekday) {
        super(nameofDoctor, weekday);
        this.nameDoctor = nameDoctor;
        this.namePatient = namePatient;
        this.age = age;
    }

    public String getnameDoctor() {
        return nameDoctor;
    }

    public void setnameDoctor(String nameDoctor) {
        this.nameDoctor = nameDoctor;
    }

    public String getnamePatient() {
        return namePatient;
    }

    public void setnamePatient(String namePatient) {
        this.namePatient = namePatient;
    }

    public int getage() {
        return age;
    }

    public void setage(int age) {
        this.age = age;
    }
}
