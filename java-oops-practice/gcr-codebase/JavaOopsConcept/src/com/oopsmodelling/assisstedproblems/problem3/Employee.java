package com.oopsmodelling.assisstedproblems.problem3;

class Employee {
    int empId;
    String empName;

    Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + empId +
                           ", Name: " + empName);
    }
}
