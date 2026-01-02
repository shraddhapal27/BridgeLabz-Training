package com.inheritance.hybridinheritance.problem2;

public class VehicleManagementSystem {
    public static void main(String[] args) {

        Vehicle ev = new ElectricVehicle("Tesla Model 3", 250, 75);
        Vehicle pv = new PetrolVehicle("Honda Civic", 220, 50);

        // Electric vehicle info
        ev.displayInfo();
        ((ElectricVehicle) ev).charge();
        System.out.println();

        // Petrol vehicle info
        pv.displayInfo();
        ((Refuelable) pv).refuel();
    }
}

