package com.Day2.problem5;

class Appliance implements Controllable {
    private String name;
    private boolean status;
    private int power; // watts

    // Default constructor
    public Appliance(String name) {
        this.name = name;
        this.power = 50;
        this.status = false;
    }

    // Overloaded constructor (user-defined power)
    public Appliance(String name, int power) {
        this.name = name;
        this.power = power;
        this.status = false;
    }

    public int getPower() {
        return power;
    }

    public String getStatus() {
        return status ? "ON" : "OFF";
    }

    @Override
    public void turnOn() {
        status = true;
        System.out.println(name + " is ON");
    }

    @Override
    public void turnOff() {
        status = false;
        System.out.println(name + " is OFF");
    }
}

