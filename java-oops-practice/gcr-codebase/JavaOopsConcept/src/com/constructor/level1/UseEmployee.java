package com.constructor.level1;

public class UseEmployee {
    public static void main(String[] args) {

        Manager manager = new Manager(
                1001,
                "IT",
                75000,
                "Senior Manager"
        );

        manager.displayManagerDetails();

        // Modifying salary using public method
        manager.updateSalary(85000);

        System.out.println("\nAfter Salary Update:");
        System.out.println("Updated Salary : ₹" + manager.getSalary());
    }
}
