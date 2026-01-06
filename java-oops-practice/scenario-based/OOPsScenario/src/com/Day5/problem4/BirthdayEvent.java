package com.Day5.problem4;
class BirthdayEvent extends Event {
    public BirthdayEvent(String eventName, String location, String date, int attendees,
                         double venueCost, double servicesCost, double discount) {
        super(eventName, location, date, attendees, venueCost, servicesCost, discount);
    }

    @Override
    public void schedule() {
        System.out.println("Birthday Event " + eventName + " scheduled with fun decorations!");
    }
}
