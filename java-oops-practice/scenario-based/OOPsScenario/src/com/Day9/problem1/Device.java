package com.Day9.problem1;

abstract class Device implements IControllable {

    protected String deviceId;
    private boolean status;              // Encapsulation
    protected double energyUsage;

    protected Device(String deviceId) {
        this.deviceId = deviceId;
        this.status = false;
        this.energyUsage = 0;
        logFirmwareUpdate();
    }

    public boolean isOn() {
        return status;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    public double calculateEnergy(double hours) {
        return energyUsage * hours;       // Operator usage
    }

    private void logFirmwareUpdate() {    // Secured log
        System.out.println("Firmware log secured for device: " + deviceId);
    }

    public abstract void reset();         // Polymorphism
}
