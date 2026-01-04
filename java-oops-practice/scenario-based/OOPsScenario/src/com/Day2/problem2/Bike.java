package com.Day2.problem2;

class Bike extends Vehicle {

    public Bike(int id, String brand, double rate) {
        super(id, brand, rate);
    }

    @Override
    public double calculateRent(int days) {
        return baseRate * days; // no surcharge
    }
}
