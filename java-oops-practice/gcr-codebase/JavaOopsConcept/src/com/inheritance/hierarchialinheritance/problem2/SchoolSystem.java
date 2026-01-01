package com.inheritance.hierarchialinheritance.problem2;

public class SchoolSystem {
    public static void main(String[] args) {

        Person p1 = new Teacher("Mr. Sharma", 40, "Mathematics");
        Person p2 = new Student("Anjali", 16, "10th Grade");
        Person p3 = new Staff("Ramesh", 35, "Administration");

        p1.displayDetails();
        p1.displayRole();
        System.out.println();

        p2.displayDetails();
        p2.displayRole();
        System.out.println();

        p3.displayDetails();
        p3.displayRole();
    }
}

