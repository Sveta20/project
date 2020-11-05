package com.java.automation.lab.fall.Gonchar.core22.domain.enums;

public enum Schedule {
    WEEKDAY ("valid from Monday to Saturday");
    WORK_HOUR ("valid from 8:00 to 20:00");

    private String descripSchedule;

    Schedule(String descripSchedule) {
        this.descripSchedule = descripSchedule;
    }

    public String getDescripSchedule() {
        return descripSchedule;
    }

    @Override
    public String toString() {
        return "Schedule:" + descripSchedule;
    }

}