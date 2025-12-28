package com.constructor.level1;

class Employee {

    // Public variable
    public int employeeID;

    // Protected variable
    protected String department;

    // Private variable
    private double salary;

    // Constructor
    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public getter for salary
    public double getSalary() {
        return salary;
    }

    // Public method to modify salary
    public void updateSalary(double newSalary) {
        if (newSalary > 0) {
            salary = newSalary;
        } else {
            System.out.println("Invalid salary amount");
        }
    }
}
