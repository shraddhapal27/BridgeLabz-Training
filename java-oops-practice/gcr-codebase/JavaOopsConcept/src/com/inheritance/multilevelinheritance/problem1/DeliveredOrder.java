package com.inheritance.multilevelinheritance.problem1;

//Subclass of ShippedOrder
class DeliveredOrder extends ShippedOrder {
 String deliveryDate;

 // Constructor
 DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
     super(orderId, orderDate, trackingNumber);
     this.deliveryDate = deliveryDate;
 }

 // Overriding method
 @Override
 String getOrderStatus() {
     return "Order Delivered";
 }

 @Override
 void displayDetails() {
     super.displayDetails();
     System.out.println("Delivery Date : " + deliveryDate);
 }
}
