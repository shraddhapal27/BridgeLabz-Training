package com.exceptionhandling.throwvsthrows;

public class ThrowThrowsExample {
	
	
 	public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException{
 		
 		// throw :- explicitly throw exception
 		if(amount < 0 | rate < 0)
 		throw new IllegalArgumentException(
 				"Invalid input : Amount and rate must be positive"
 				);
 		
 		// simple interest formula
		return (amount*rate*years)/100;
	}
 	
 	public static void main(String[] args) {
 	    try {
 	    	double interest = calculateInterest(10000, 5, 2);
 	    	System.out.println("calculated interest: " + interest);
 	    }	
 	    catch(IllegalArgumentException e) {
 	    	System.out.println("Invalid input : Amount and rate must be positive");
 	    }
 	}
}
