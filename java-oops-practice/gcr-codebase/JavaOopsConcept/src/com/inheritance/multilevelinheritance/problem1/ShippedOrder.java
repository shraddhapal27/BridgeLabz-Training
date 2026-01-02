package com.inheritance.multilevelinheritance.problem1;

//Subclass of Order
class ShippedOrder extends Order {
 String trackingNumber;

 // Constructor
 ShippedOrder(int orderId, String orderDate, String trackingNumber) {
     super(orderId, orderDate);
     this.trackingNumber = trackingNumber;
 }

 // Overriding method
 @Override
 String getOrderStatus() {
     return "Order Shipped";
 }

 @Override
 void displayDetails() {
     super.displayDetails();
     System.out.println("Tracking No : " + trackingNumber);
 }
}
