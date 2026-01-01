package com.oopsmodelling.assisstedproblems.problem3;

public class UseCompany {
    public static void main(String[] args) {

        Company company = new Company("TechNova Pvt Ltd");

        Department d1 = new Department("IT");
        d1.addEmployee(101, "Rahul");
        d1.addEmployee(102, "Sneha");

        Department d2 = new Department("HR");
        d2.addEmployee(201, "Anjali");

        company.addDepartment(d1);
        company.addDepartment(d2);

        company.showCompanyDetails();

        // Deleting company
        company.deleteCompany();
    }
}

