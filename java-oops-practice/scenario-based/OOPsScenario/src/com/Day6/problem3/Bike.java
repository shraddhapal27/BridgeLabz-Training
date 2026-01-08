package com.Day6.problem3;

public class Bike extends Vehicle {

	 // Constructor
	 public Bike(String vehicleNumber) {
	     super(vehicleNumber, 20);
	 }

	 // Charges for bike
	 public double calculateCharges(int hours) {
	     if (hours > 5) {
	         return (baseRate * hours) + 50;
	     }
	     return baseRate * hours;
	 }
	}