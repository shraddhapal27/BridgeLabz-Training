package com.encapsulation.problem3;

import java.util.ArrayList;

public class VehicleRentalSystem {

    public static void main(String[] args) {

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR101", 1500, "CAR-INS-11"));
        vehicles.add(new Bike("BIKE202", 500, "BIKE-INS-22"));
        vehicles.add(new Truck("TRK303", 3000, "TRK-INS-33"));

        int rentalDays = 5;

        for (Vehicle v : vehicles) {
            v.displayVehicleDetails();

            double rentalCost = v.calculateRentalCost(rentalDays);
            double insuranceCost = ((Insurable) v).calculateInsurance();

            System.out.println("Rental Cost (" + rentalDays + " days): " + rentalCost);
            System.out.println("Insurance Cost: " + insuranceCost);
            System.out.println(((Insurable) v).getInsuranceDetails());
            System.out.println("-----------------------------");
        }
    }
}
