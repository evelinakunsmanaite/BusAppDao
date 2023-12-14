package com.model;

public class Schedule {

    private String routeNumber;
    private String schedule;

    public Schedule(String routeNumber, String schedule) {
        this.routeNumber = routeNumber;
        this.schedule = schedule;

    }

    public String getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(String busNumber) {
        this.routeNumber = routeNumber;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return routeNumber + " : " + schedule;
    }
}
