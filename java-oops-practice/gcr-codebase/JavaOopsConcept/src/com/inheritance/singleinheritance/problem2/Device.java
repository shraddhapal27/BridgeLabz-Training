package com.inheritance.singleinheritance.problem2;

//Superclass
class Device {
 String deviceId;
 String status;   // ON or OFF

 // Constructor
 Device(String deviceId, String status) {
     this.deviceId = deviceId;
     this.status = status;
 }

 // Method to display device status
 void displayStatus() {
     System.out.println("Device ID : " + deviceId);
     System.out.println("Status    : " + status);
 }
}
