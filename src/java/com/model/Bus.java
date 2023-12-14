package com.model;

public class Bus {

    private int id;
    private String driverName;
    private String busNumber;
    private String routeNumber;
    private String brand;
    private int yearOfService;
    private int mileage;

    public Bus(int id, String driverName, String busNumber, String routeNumber, String brand, int yearOfService, int mileage) {
        this.id = id;
        this.driverName = driverName;
        this.busNumber = busNumber;
        this.routeNumber = routeNumber;
        this.brand = brand;
        this.yearOfService = yearOfService;
        this.mileage = mileage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public String getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(String routeNumber) {
        this.routeNumber = routeNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearOfService() {
        return yearOfService;
    }

    public void setYearOfService(int yearOfService) {
        this.yearOfService = yearOfService;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Фамилия и инициалы водителя: " + driverName + ", номер автобуса: " + busNumber + ", номер маршрута: " + routeNumber + ", марка: " + brand + ", год начала эксплуатации: " + yearOfService + ", пробег: " + mileage + " км";
    }
}
