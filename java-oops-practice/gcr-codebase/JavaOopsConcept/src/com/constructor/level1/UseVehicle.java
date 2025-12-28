package com.constructor.level1;

public class UseVehicle {
  public static void main(String[] args) {
	  
	  Vehicle v1 = new Vehicle("Amit", "Car");
      Vehicle v2 = new Vehicle("Neha", "Bike");

      v1.displayVehicleDetails();
      System.out.println();

      v2.displayVehicleDetails();
      System.out.println("\nUpdating Registration Fee...\n");

      // Update registration fee for all vehicles
      Vehicle.updateRegistrationFee(6500.0);

      v1.displayVehicleDetails();
      System.out.println();

      v2.displayVehicleDetails();
  }
}
