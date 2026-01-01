package com.oopsmodelling.assisstedproblems.problem3;

import java.util.ArrayList;

class Department {
    String deptName;
    ArrayList<Employee> employees;

    Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    void addEmployee(int id, String name) {
        employees.add(new Employee(id, name));
    }

    void showEmployees() {
        System.out.println("Department: " + deptName);
        for (Employee emp : employees) {
            emp.displayEmployee();
        }
    }
}
