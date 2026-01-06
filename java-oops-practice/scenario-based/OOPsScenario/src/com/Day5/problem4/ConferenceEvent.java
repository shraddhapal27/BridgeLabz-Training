package com.Day5.problem4;

class ConferenceEvent extends Event {
    public ConferenceEvent(String eventName, String location, String date, int attendees,
                           double venueCost, double servicesCost, double discount) {
        super(eventName, location, date, attendees, venueCost, servicesCost, discount);
    }

    @Override
    public void schedule() {
        System.out.println("Conference Event " + eventName + " scheduled with professional setup.");
    }
}