package com.java8workshop;

class AmbulanceService implements TransportService, EmergencyService {
    public String getServiceName() { return "🚑 Ambulance"; }
    public String getRoute() { return "City-Wide"; }
    public double getFare() { return 0; }
    public String getDepartureTime() { return "Anytime"; }
    public int getPassengers() { return 1; }
}