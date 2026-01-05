package com.Day2.problem5;

public class SmartHomeSystem {
    public static void main(String[] args) {

        Appliance light = new Light("Bedroom Light", 20);
        Appliance fan = new Fan("Ceiling Fan", 75);
        Appliance ac = new AC("Room AC", 1500);

        UserController controller = new UserController();

        // Polymorphism in action
        controller.controlDevice(light, true);
        controller.controlDevice(fan, true);
        controller.controlDevice(ac, true);

        // Compare energy usage
        controller.compareEnergy(ac, fan);
    }
}
