package com.inheritance.assisstedproblems.problem2;

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        Employee e1 = new Manager("Amit", 101, 80000, 10);
        Employee e2 = new Developer("Riya", 102, 60000, "Java");
        Employee e3 = new Intern("Kunal", 103, 15000, 6);

        e1.displayDetails();
        System.out.println();

        e2.displayDetails();
        System.out.println();

        e3.displayDetails();
    }
}

