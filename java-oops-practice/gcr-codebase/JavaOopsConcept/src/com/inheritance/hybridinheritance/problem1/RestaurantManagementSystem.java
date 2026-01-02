package com.inheritance.hybridinheritance.problem1;

public class RestaurantManagementSystem {
    public static void main(String[] args) {

        Person p1 = new Chef("Amit", 101);
        Person p2 = new Waiter("Ravi", 102);

        p1.displayInfo();
        ((Worker) p1).performDuties();
        System.out.println();

        p2.displayInfo();
        ((Worker) p2).performDuties();
    }
}
