package com.java.automation.lab.fall.Gonchar.core22.domain.classes;

public class UnpaidRegistry extends Hospital {
    private int id;

    public UnpaidRegistry(int id, String name, String country) {
        super(name, country);
        this.id = id;
    }

        public int getid () {
            return id;
        }

        public void setid (int id){
            this.id = id;
        }
}
