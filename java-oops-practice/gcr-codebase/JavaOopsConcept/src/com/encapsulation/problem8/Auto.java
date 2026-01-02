package com.encapsulation.problem8;

class Auto extends Vehicle {

    public Auto(int id, String driverName, double ratePerKm) {
        super(id, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 1.1; // 10% extra
    }
}
