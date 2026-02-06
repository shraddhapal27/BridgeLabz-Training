package com.java8workshop;

interface TransportService {
    String getServiceName();
    String getRoute();
    double getFare();
    String getDepartureTime();
    int getPassengers();

    default void printServiceDetails() {
        System.out.println(
                getServiceName() +
                " | Route: " + getRoute() +
                " | Fare: " + getFare() +
                " | Time: " + getDepartureTime() +
                " | Passengers: " + getPassengers()
        );
    }
}
