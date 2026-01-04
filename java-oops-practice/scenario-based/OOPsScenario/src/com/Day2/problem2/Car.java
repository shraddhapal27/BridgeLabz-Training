package com.Day2.problem2;

class Car extends Vehicle {

    public Car(int id, String brand, double rate) {
        super(id, brand, rate);
    }

    @Override
    public double calculateRent(int days) {
        double surcharge = 200;
        return (baseRate * days) + surcharge;
    }
}
