package com.Day3.problem1;

class RideService implements IRideService {

    private Vehicle vehicle;
    private Driver driver;
    private double fare;
    private final double baseFare = 50;

    public RideService(Vehicle vehicle, Driver driver) {
        this.vehicle = vehicle;
        this.driver = driver;
    }

    @Override
    public void bookRide(int distance) {
        fare = baseFare + (distance * vehicle.ratePerKm);
        System.out.println("Ride Booked 🚖");
        System.out.println(vehicle.getVehicleDetails());
        System.out.println(driver.getDriverDetails());
        System.out.println("Estimated Fare: ₹" + fare);
    }

    @Override
    public void endRide() {
        System.out.println("Ride Ended ✅");
        System.out.println("Final Fare: ₹" + fare);
    }
}

