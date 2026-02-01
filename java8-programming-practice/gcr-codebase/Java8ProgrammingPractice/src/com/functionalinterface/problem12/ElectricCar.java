package com.functionalinterface.problem12;

public class ElectricCar implements Vehicle {
    @Override
    public void displaySpeed() {
        System.out.println("Electric car speed: 70 km/h");
    }

    @Override
    public void displayBattery() {
        System.out.println("Battery: 85%");
    }
}