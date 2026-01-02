package com.inheritance.multilevelinheritance.problem1;

//Base class
class Order {
 int orderId;
 String orderDate;

 // Constructor
 Order(int orderId, String orderDate) {
     this.orderId = orderId;
     this.orderDate = orderDate;
 }

 // Method to get order status
 String getOrderStatus() {
     return "Order Placed";
 }

 void displayDetails() {
     System.out.println("Order ID   : " + orderId);
     System.out.println("Order Date : " + orderDate);
     System.out.println("Status     : " + getOrderStatus());
 }
}
