package com.constructor.level1;

public class HotelBooking {
	String guestName;
    String roomType;
    int nights;
    
    // Default constructor
    HotelBooking(){
    	guestName = "Aadi";
    	roomType = "Standard";
    	nights = 1;
    }
    
    // Parameterized consrtuctor
    HotelBooking(String guestName, String roomType, int nights){
    	this.guestName = guestName;
    	this.roomType = roomType;
    	this.nights = nights;
    }
    
    // Copy Constructor
    HotelBooking(HotelBooking hb) {
        this.guestName = hb.guestName;
        this.roomType = hb.roomType;
        this.nights = hb.nights;
    }
    
    // Method to display booking details
    void displayBooking() {
        System.out.println("Guest Name : " + guestName);
        System.out.println("Room Type  : " + roomType);
        System.out.println("Nights     : " + nights);
    }
}
