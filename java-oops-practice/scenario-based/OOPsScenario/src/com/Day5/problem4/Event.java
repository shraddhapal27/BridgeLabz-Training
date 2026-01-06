package com.Day5.problem4;

import java.util.UUID;

class Event implements ISchedulable {
    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;
    private final String eventId; // cannot be edited
    private double venueCost;
    private double servicesCost;
    private double discount;

    public Event(String eventName, String location, String date, int attendees) {
        this(eventName, location, date, attendees, 0, 0, 0);
    }

    public Event(String eventName, String location, String date, int attendees,
                 double venueCost, double servicesCost, double discount) {
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.eventId = UUID.randomUUID().toString(); // unique event ID
        this.venueCost = venueCost;
        this.servicesCost = servicesCost;
        this.discount = discount;
    }

    // Encapsulated pricing calculation
    public double calculateTotalCost() {
        return venueCost + servicesCost - discount;
    }

    @Override
    public void schedule() {
        System.out.println("Event " + eventName + " scheduled on " + date);
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Event " + eventName + " rescheduled to " + date);
    }

    @Override
    public void cancel() {
        System.out.println("Event " + eventName + " has been cancelled.");
    }

    public void showEventDetails() {
        System.out.println("Event: " + eventName + " | Location: " + location + " | Date: " + date +
                           " | Attendees: " + attendees + " | Total Cost: $" + calculateTotalCost());
    }

    public String getEventId() {
        return eventId;
    }
}