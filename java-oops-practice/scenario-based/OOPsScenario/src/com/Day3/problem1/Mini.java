package com.Day3.problem1;

class Mini extends Vehicle implements IRideService {

    public Mini(String number) {
        super(number, 4, "Mini", 10);
    }

    @Override
    public void bookRide(double distance) {
        calculateFare(distance);
        System.out.println("Mini ride booked");
        System.out.println("Fare: ₹" + getFare());
    }

    @Override
    public void endRide() {
        System.out.println("Mini ride ended");
    }
}
