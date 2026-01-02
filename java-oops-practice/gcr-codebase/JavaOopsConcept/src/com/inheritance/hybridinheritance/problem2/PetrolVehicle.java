package com.inheritance.hybridinheritance.problem2;

class PetrolVehicle extends Vehicle implements Refuelable {

    int fuelTankCapacity; // in liters

    PetrolVehicle(String model, int maxSpeed, int fuelTankCapacity) {
        super(model, maxSpeed);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle. Fuel tank capacity: " + fuelTankCapacity + " liters");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Fuel Tank Capacity : " + fuelTankCapacity + " liters");
    }
}
