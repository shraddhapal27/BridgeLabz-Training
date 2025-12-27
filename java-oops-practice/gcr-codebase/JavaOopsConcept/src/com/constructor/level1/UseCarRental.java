package com.constructor.level1;

public class UseCarRental {
	 public static void main(String[] args) {

	        // Using default constructor
	        CarRental r1 = new CarRental();
	        r1.displayRental();

	        // Using parameterized constructor
	        CarRental r2 = new CarRental("Shraddha", "Sedan", 3);
	        r2.displayRental();
	    }
}
