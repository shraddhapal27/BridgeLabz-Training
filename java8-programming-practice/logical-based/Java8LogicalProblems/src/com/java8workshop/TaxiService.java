package com.java8workshop;

class TaxiService implements TransportService {
    private String route, time;
    private double fare;
    private int passengers;

    TaxiService(String route, double fare, String time, int passengers) {
        this.route = route;
        this.fare = fare;
        this.time = time;
        this.passengers = passengers;
    }

    public String getServiceName() { return "🚕 Taxi"; }
    public String getRoute() { return route; }
    public double getFare() { return fare; }
    public String getDepartureTime() { return time; }
    public int getPassengers() { return passengers; }
}