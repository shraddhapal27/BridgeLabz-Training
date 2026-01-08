package com.Day6.problem3;

public class Car extends Vehicle {

	 // Constructor
	 public Car(String vehicleNumber) {
	     super(vehicleNumber, 50); // base rate per hour
	 }

	 // Charges for car
	 public double calculateCharges(int hours) {
	     if (hours > 5) {
	         return (baseRate * hours) + 100; // penalty
	     }
	     return baseRate * hours;
	 }
	}