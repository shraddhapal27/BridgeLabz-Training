package com.Day6.problem3;

public class Vehicle implements IPayable {

	 protected String vehicleNumber;
	 protected double baseRate;

	 // Constructor
	 public Vehicle(String vehicleNumber, double baseRate) {
	     this.vehicleNumber = vehicleNumber;
	     this.baseRate = baseRate;
	 }

	 // Default charge calculation
	 public double calculateCharges(int hours) {
	     return baseRate * hours;
	 }
	}