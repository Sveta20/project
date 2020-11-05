package com.java.automation.lab.fall.Gonchar.core22.domain.classes;

import com.java.automation.lab.fall.Gonchar.core22.domain.interfaces.IForm;

public abstract class Services extends Doctors implements IForm {
    protected String appellation;

    public Services(String category, String name, String country, String appellation, String fio,
                    String categoria, String experience) {
        super(name, country, category, fio, categoria, experience);
        this.appellation = appellation;
    }

    public String getappellation() {
        return appellation;
    }

    public void setappellation(String appellation) {
        this.appellation = appellation;
    }

    public void form(int n) {
        if (n==free)
            System.out.println("Service is free");
        else if (n==paid)
            System.out.println("Service ia paid");
        else
            System.out.println("State is invalid");
    }
}
