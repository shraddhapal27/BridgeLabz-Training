package com.constructor.level1;

public class UseHotelBooking {
  public static void main(String[] args) {
	  // using default constructor
	  HotelBooking b1 = new HotelBooking();
	  b1.displayBooking();
	  
	   // Using parameterized constructor
      HotelBooking b2 = new HotelBooking("Shraddha", "Deluxe", 3);
      b2.displayBooking();
      
      // Using copy constructor
      HotelBooking b3 = new HotelBooking(b2);
      b3.displayBooking();
  }
}
