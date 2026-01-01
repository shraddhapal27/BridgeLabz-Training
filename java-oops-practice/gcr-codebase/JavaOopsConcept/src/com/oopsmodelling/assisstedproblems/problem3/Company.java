package com.oopsmodelling.assisstedproblems.problem3;

import java.util.ArrayList;

class Company {
    String companyName;
    ArrayList<Department> departments;

    Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    void addDepartment(Department dept) {
        departments.add(dept);
    }

    void showCompanyDetails() {
        System.out.println("Company: " + companyName);
        for (Department dept : departments) {
            dept.showEmployees();
            System.out.println();
        }
    }

    // Simulating deletion of company
    void deleteCompany() {
        departments.clear();
        System.out.println("Company deleted. All departments and employees removed.");
    }
}
