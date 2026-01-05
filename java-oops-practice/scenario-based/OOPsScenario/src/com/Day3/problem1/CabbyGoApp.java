package com.Day3.problem1;

public class CabbyGoApp {
    public static void main(String[] args) {

        Driver d1 = new Driver("Rahul", "DL12345", 4.8);

        IRideService ride1 = new Mini("MH12AB1234");
        IRideService ride2 = new Sedan("MH14CD5678");

        System.out.println(d1.getDriverInfo());
        System.out.println("Rating: " + d1.getRating());

        ride1.bookRide(10);   // polymorphism
        ride1.endRide();

        System.out.println();

        ride2.bookRide(8);
        ride2.endRide();
    }
}
