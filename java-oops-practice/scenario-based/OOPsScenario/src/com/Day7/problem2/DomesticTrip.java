package com.Day7.problem2;

class DomesticTrip extends Trip {

    DomesticTrip(String destination, int duration,
                 Transport transport, Hotel hotel, Activity activity) {
        super(destination, duration, transport, hotel, activity);
    }

    @Override
    public void book() {
        System.out.println("Domestic trip booked to " + destination);
    }

    @Override
    public void cancel() {
        System.out.println("Domestic trip cancelled");
    }
}
