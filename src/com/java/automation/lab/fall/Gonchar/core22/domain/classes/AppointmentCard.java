package com.java.automation.lab.fall.Gonchar.core22.domain.classes;

public class AppointmentCard {
    private String nameofDoctor;
    private String weekday;

    public AppointmentCard(String nameofDoctor, String weekday) {
        this.nameofDoctor = nameofDoctor;
        this.weekday = weekday;
        }

    public String getnameofDoctor() {
        return nameofDoctor;
    }

    public void setnameofDoctor(String nameofDoctor) {
        this.nameofDoctor = nameofDoctor;
    }

    public String getweekday() {
        return weekday;
    }

    public void setweekday(String weekday) {
        this.weekday = weekday;
    }
}
