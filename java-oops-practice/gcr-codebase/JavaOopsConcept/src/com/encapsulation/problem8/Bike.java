package com.encapsulation.problem8;

class Bike extends Vehicle {

    public Bike(int id, String driverName, double ratePerKm) {
        super(id, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm(); // cheapest
    }
}
