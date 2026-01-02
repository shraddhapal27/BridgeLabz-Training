package com.encapsulation.problem1;

import java.util.ArrayList;

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        Employee e1 = new FullTimeEmployee(101, "Rahul", 50000);
        Employee e2 = new PartTimeEmployee(102, "Anita", 20, 500);

        ((Department) e1).assignDepartment("IT");
        ((Department) e2).assignDepartment("HR");

        employees.add(e1);
        employees.add(e2);

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Department: " +
                    ((Department) emp).getDepartmentDetails());
            System.out.println("Salary: " + emp.calculateSalary());
            System.out.println("----------------------");
        }
    }
}
