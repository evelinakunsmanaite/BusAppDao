package com.model;

public class Schedule {
private int id;
    private String routeNumber;
    private String schedule;

    public Schedule(String routeNumber, String schedule) {
        this.routeNumber = routeNumber;
        this.schedule = schedule;

    }

    public Schedule(int id, String routeNumber, String schedule) {
        this.id = id;
        this.routeNumber = routeNumber;
        this.schedule = schedule;
    }
    
     public Schedule(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
