package com.encapsulation.problem8;

public class RideHailingApp {

    public static void main(String[] args) {

        Vehicle v1 = new Car(101, "Rohit", 15);
        Vehicle v2 = new Bike(102, "Aman", 8);
        Vehicle v3 = new Auto(103, "Suresh", 10);

        Vehicle[] vehicles = { v1, v2, v3 };

        double distance = 10; // km

        for (Vehicle v : vehicles) {
            v.updateLocation("City Center");
            v.getVehicleDetails();
            System.out.println("Fare for " + distance + " km: ₹" + v.calculateFare(distance));
            System.out.println("---------------------------");
        }
    }
}
