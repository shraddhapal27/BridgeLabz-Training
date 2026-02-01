package com.functionalinterface.problem12;

public interface Vehicle {
    void displaySpeed();

    // Default method for electric vehicle battery
    default void displayBattery() {
        // By default, do nothing for non-electric vehicles
    }
}
