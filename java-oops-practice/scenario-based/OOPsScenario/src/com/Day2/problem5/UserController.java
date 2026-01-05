package com.Day2.problem5;

class UserController {

    public void controlDevice(Controllable device, boolean turnOn) {
        if (turnOn) {
            device.turnOn();
        } else {
            device.turnOff();
        }
    }

    public void compareEnergy(Appliance a1, Appliance a2) {
        if (a1.getPower() > a2.getPower()) {
            System.out.println("First appliance consumes more power");
        } else if (a1.getPower() < a2.getPower()) {
            System.out.println("Second appliance consumes more power");
        } else {
            System.out.println("Both consume equal power");
        }
    }
}
