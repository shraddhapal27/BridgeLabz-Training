package com.functionalinterface.problem12;

public class TestDashboard {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle eCar = new ElectricCar();

        car.displaySpeed();
        car.displayBattery(); // does nothing

        eCar.displaySpeed();
        eCar.displayBattery(); // shows battery
    }
}
