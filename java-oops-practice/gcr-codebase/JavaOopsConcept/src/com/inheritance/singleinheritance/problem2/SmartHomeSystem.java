package com.inheritance.singleinheritance.problem2;

public class SmartHomeSystem {
    public static void main(String[] args) {

        Thermostat t1 = new Thermostat("TH-101", "ON", 24);
        Thermostat t2 = new Thermostat("TH-102", "OFF", 18);

        t1.displayStatus();
        System.out.println();

        t2.displayStatus();
    }
}

