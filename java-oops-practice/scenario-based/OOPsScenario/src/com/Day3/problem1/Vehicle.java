package com.Day3.problem1;

class Vehicle {
    private String vehicleNumber;
    private int capacity;
    private String type;
    private double fare;     // sensitive data
    private String location; // sensitive data

    protected double ratePerKm;

    public Vehicle(String vehicleNumber, int capacity, String type, double ratePerKm) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
        this.ratePerKm = ratePerKm;
    }

    protected void calculateFare(double distance) {
        double baseFare = 50;
        fare = baseFare + (distance * ratePerKm);
    }

    public double getFare() {
        return fare;
    }

    public String getVehicleInfo() {
        return type + " | " + vehicleNumber + " | Capacity: " + capacity;
    }
}
