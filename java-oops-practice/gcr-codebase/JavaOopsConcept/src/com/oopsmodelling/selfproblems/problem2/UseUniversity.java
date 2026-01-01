package com.oopsmodelling.selfproblems.problem2;

public class UseUniversity {
    public static void main(String[] args) {

        University uni = new University("National Technical University");

        // Faculty (independent objects)
        Faculty f1 = new Faculty(1, "Dr. Sharma");
        Faculty f2 = new Faculty(2, "Dr. Mehta");

        // Departments
        Department d1 = new Department("Computer Science");
        Department d2 = new Department("Mechanical");

        // Aggregation
        uni.addFaculty(f1);
        uni.addFaculty(f2);

        // Faculty working in departments
        d1.addFaculty(f1);
        d2.addFaculty(f2);

        // Composition
        uni.addDepartment(d1);
        uni.addDepartment(d2);

        uni.showUniversityDetails();

        // Delete university
        uni.deleteUniversity();

        // Faculty still exists
        System.out.println("\nFaculty still exists independently:");
        f1.displayFaculty();
        f2.displayFaculty();
    }
}

