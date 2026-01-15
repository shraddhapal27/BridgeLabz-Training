package com.Day9.problem1;

class Camera extends Device {

    public Camera(String deviceId) {
        super(deviceId);
        energyUsage = 20;
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Camera recording started");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Camera recording stopped");
    }

    public void reset() {
        System.out.println("Camera angle reset");
    }
}
