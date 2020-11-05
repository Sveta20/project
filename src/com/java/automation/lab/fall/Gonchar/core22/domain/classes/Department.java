package com.java.automation.lab.fall.Gonchar.core22.domain.classes;

public class Department extends Hospital{
    private String category;

    public Department(String category, String name, String country) {
        super(name, country);
        this.category = category;
    }

    public String getcategory() {
        return category;
    }

    public void setcategory(String category) {
        this.category = category;
    }
}
