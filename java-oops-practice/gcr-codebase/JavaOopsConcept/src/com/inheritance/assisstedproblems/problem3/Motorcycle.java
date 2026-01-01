package com.inheritance.assisstedproblems.problem3;

class Motorcycle extends Vehicle {
    boolean hasGear;

    Motorcycle(int maxSpeed, String fuelType, boolean hasGear) {
        super(maxSpeed, fuelType);
        this.hasGear = hasGear;
    }

    // Overriding method
    @Override
    void displayInfo() {
        System.out.println("Vehicle Type : Motorcycle");
        super.displayInfo();
        System.out.println("Has Gear    : " + hasGear);
    }
}
