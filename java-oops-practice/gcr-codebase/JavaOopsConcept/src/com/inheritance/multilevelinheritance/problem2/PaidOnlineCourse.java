package com.inheritance.multilevelinheritance.problem2;

//Subclass of OnlineCourse
class PaidOnlineCourse extends OnlineCourse {
 double fee;
 double discount; // in percentage

 // Constructor
 PaidOnlineCourse(String courseName, int duration, String platform,
                  boolean isRecorded, double fee, double discount) {
     super(courseName, duration, platform, isRecorded);
     this.fee = fee;
     this.discount = discount;
 }

 double calculateFinalFee() {
     return fee - (fee * discount / 100);
 }

 @Override
 void displayDetails() {
     super.displayDetails();
     System.out.println("Course Fee  : " + fee);
     System.out.println("Discount   : " + discount + "%");
     System.out.println("Final Fee  : " + calculateFinalFee());
 }
}
