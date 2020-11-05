package com.java.automation.lab.fall.Gonchar.core22.domain.classes;

import com.java.automation.lab.fall.Gonchar.core22.domain.interfaces.IService;

public abstract class TestResult extends Diagnosis implements IService {
    private  String indicators;

    public TestResult(String nameDoctor, String namePatient, int age, String indicators, String nameofDoctor,
                      String weekday, String name) {
        super(nameDoctor, namePatient, age, nameofDoctor, weekday, name);
        this.indicators = indicators;
    }

    public String getindicators() {
        return indicators;
    }

    public void setindicators(String indicators) {
        this.indicators = indicators;
    }

    public void service(int k) {
        if (k==free)
            System.out.println("Service is free");
        else if (k==paid)
            System.out.println("Service ia paid");
        else
            System.out.println("State is invalid");
    }
}
