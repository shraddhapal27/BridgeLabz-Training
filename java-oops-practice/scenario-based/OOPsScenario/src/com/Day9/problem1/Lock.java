package com.Day9.problem1;

class Lock extends Device {

    public Lock(String deviceId) {
        super(deviceId);
        energyUsage = 5;
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Lock engaged");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Lock disengaged");
    }

    public void reset() {
        System.out.println("Lock security settings reset");
    }
}

