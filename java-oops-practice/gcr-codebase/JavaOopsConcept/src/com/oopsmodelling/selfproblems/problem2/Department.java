package com.oopsmodelling.selfproblems.problem2;

import java.util.ArrayList;

class Department {
    String deptName;
    ArrayList<Faculty> facultyList;

    Department(String deptName) {
        this.deptName = deptName;
        this.facultyList = new ArrayList<>();
    }

    // Aggregation inside department
    void addFaculty(Faculty faculty) {
        facultyList.add(faculty);
    }

    void showDepartmentDetails() {
        System.out.println("Department: " + deptName);
        for (Faculty f : facultyList) {
            f.displayFaculty();
        }
        System.out.println();
    }
}
