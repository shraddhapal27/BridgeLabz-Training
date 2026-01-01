package com.inheritance.assisstedproblems.problem2;

class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    // Overriding method
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size : " + teamSize);
        System.out.println("Role      : Manager");
    }
}

