package com.Day3.problem1;

class Sedan extends Vehicle implements IRideService {

    public Sedan(String number) {
        super(number, 4, "Sedan", 15);
    }

    @Override
    public void bookRide(double distance) {
        calculateFare(distance);
        System.out.println("Sedan ride booked");
        System.out.println("Fare: ₹" + getFare());
    }

    @Override
    public void endRide() {
        System.out.println("Sedan ride ended");
    }
}

