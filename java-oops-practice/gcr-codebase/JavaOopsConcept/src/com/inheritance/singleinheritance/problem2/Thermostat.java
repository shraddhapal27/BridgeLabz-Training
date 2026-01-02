package com.inheritance.singleinheritance.problem2;

//Subclass extending Device
class Thermostat extends Device {
 int temperatureSetting;

 // Constructor
 Thermostat(String deviceId, String status, int temperatureSetting) {
     super(deviceId, status);
     this.temperatureSetting = temperatureSetting;
 }

 // Overriding displayStatus()
 @Override
 void displayStatus() {
     super.displayStatus();
     System.out.println("Temperature Setting : " + temperatureSetting + "°C");
 }
}
