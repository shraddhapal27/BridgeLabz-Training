package com.constructor.level1;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double totalCost;
    
    CarRental(){
    	customerName = "Guest";
        carModel = "Hatchback";
        rentalDays = 1;
        calculateCost();
    }
    
    
     // Parameterized Constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        calculateCost();
    }

    // Method to calculate total cost
    void calculateCost() {
        double costPerDay = 1500;
        totalCost = rentalDays * costPerDay;
    }

    // Method to display rental details
    void displayRental() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Total Cost    : ₹" + totalCost);
        System.out.println("-----------------------------");
    }
}
