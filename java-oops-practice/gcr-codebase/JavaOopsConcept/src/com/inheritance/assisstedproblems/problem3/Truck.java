package com.inheritance.assisstedproblems.problem3;

class Truck extends Vehicle {
    int loadCapacity; // in tons

    Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    // Overriding method
    @Override
    void displayInfo() {
        System.out.println("Vehicle Type : Truck");
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

