package com.inheritance.assisstedproblems.problem3;

class Car extends Vehicle {
    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    // Overriding method
    @Override
    void displayInfo() {
        System.out.println("Vehicle Type : Car");
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

