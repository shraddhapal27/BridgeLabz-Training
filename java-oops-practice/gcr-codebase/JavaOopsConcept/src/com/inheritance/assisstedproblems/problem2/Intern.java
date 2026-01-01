package com.inheritance.assisstedproblems.problem2;

class Intern extends Employee {
    int duration; // in months

    Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    // Overriding method
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration : " + duration + " months");
        System.out.println("Role                : Intern");
    }
}
