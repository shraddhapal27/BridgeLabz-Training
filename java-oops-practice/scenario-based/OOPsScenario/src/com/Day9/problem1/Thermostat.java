package com.Day9.problem1;

class Thermostat extends Device {

    public Thermostat(String deviceId) {
        super(deviceId);
        energyUsage = 15;
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Thermostat ON");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Thermostat OFF");
    }

    public void reset() {
        System.out.println("Temperature reset to 22°C");
    }
}
