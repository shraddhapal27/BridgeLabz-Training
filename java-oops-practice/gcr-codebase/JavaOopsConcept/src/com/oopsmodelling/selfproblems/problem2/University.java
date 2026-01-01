package com.oopsmodelling.selfproblems.problem2;

import java.util.ArrayList;

class University {
    String universityName;
    ArrayList<Department> departments;
    ArrayList<Faculty> facultyMembers;

    University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.facultyMembers = new ArrayList<>();
    }

    // Composition: University creates and owns departments
    void addDepartment(Department dept) {
        departments.add(dept);
    }

    // Aggregation: Faculty added, not owned
    void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    void showUniversityDetails() {
        System.out.println("University: " + universityName);

        System.out.println("Faculties:");
        for (Faculty f : facultyMembers) {
            f.displayFaculty();
        }

        System.out.println("\nDepartments:");
        for (Department d : departments) {
            d.showDepartmentDetails();
        }
    }

    // Simulating deletion
    void deleteUniversity() {
        departments.clear();  // Departments destroyed
        System.out.println("University deleted. All departments removed.");
    }
}
