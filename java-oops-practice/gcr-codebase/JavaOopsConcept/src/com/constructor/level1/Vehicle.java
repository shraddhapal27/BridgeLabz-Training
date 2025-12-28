package com.constructor.level1;

  public class Vehicle {
     String ownerName;
     String vehicleType;
  
   //Class variable (shared by all vehicles)

  static double registrationFee = 0.0;
  
   // Constructor
  Vehicle(String ownerName, String vehicleType) {
      this.ownerName = ownerName;
      this.vehicleType = vehicleType;
  }
  
   //Instance method
 public void displayVehicleDetails() {
	 System.out.println("owner name : " + ownerName);
	 System.out.println("vehicle type : " + vehicleType);
	 System.out.println("Registration Fee  : ₹" + registrationFee);
 }
 
  //Class method
 static void updateRegistrationFee(double newRegisterationFee) {
	 registrationFee = newRegisterationFee;
 }
}
