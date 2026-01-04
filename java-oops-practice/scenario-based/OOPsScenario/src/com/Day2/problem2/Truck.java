package com.Day2.problem2;

class Truck extends Vehicle {

    public Truck(int id, String brand, double rate) {
        super(id, brand, rate);
    }

    @Override
    public double calculateRent(int days) {
        double heavyLoadCharge = 500;
        return (baseRate * days) + heavyLoadCharge;
    }
}
