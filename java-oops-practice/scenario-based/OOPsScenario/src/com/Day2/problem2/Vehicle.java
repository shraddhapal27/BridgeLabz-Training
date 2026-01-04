package com.Day2.problem2;

class Vehicle implements Rentable {

    protected int vehicleId;
    protected String brand;
    protected double baseRate;

    public Vehicle(int vehicleId, String brand, double baseRate) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    // Encapsulation via getters
    public int getVehicleId() {
        return vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public double getBaseRate() {
        return baseRate;
    }

    // Default implementation (will be overridden)
    @Override
    public double calculateRent(int days) {
        return baseRate * days;
    }

    public void displayInfo() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Brand: " + brand);
    }
}
