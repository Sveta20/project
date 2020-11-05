package com.java.automation.lab.fall.Gonchar.core22.domain.classes;

public class Onology extends Department{
    private String vid;
    private int dead;

    public Onology(String vid, int dead, String category, String name, String country) {
        super(name, country, category);
        this.vid = vid;
        this.dead = dead;
    }

    public String getvid() {
        return vid;
    }

    public void setvid(String vid) {
        this.vid = vid;
    }

    public int getdead () {
        return dead;
    }

    public void setdead (int dead){
        this.dead = dead;
    }
}
