package com.Day3.problem1;

class SUV extends Vehicle implements IRideService {

    public SUV(String number) {
        super(number, 6, "SUV", 20);
    }

    @Override
    public void bookRide(double distance) {
        calculateFare(distance);
        System.out.println("SUV ride booked");
        System.out.println("Fare: ₹" + getFare());
    }

    @Override
    public void endRide() {
        System.out.println("SUV ride ended");
    }
}
