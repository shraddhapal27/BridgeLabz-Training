package com.encapsulation.problem8;

class Car extends Vehicle {

    public Car(int id, String driverName, double ratePerKm) {
        super(id, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 1.2; // 20% extra for comfort
    }
}
