package com.Day7.problem2;

class InternationalTrip extends Trip {

    InternationalTrip(String destination, int duration,
                      Transport transport, Hotel hotel, Activity activity) {
        super(destination, duration, transport, hotel, activity);
    }

    @Override
    public void book() {
        System.out.println("International trip booked with passport & visa verification");
    }

    @Override
    public void cancel() {
        System.out.println("International trip cancelled with refund policy");
    }
}
