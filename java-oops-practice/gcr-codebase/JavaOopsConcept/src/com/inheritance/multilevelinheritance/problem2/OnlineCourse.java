package com.inheritance.multilevelinheritance.problem2;

//Subclass of Course
class OnlineCourse extends Course {
 String platform;
 boolean isRecorded;

 // Constructor
 OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
     super(courseName, duration);
     this.platform = platform;
     this.isRecorded = isRecorded;
 }

 @Override
 void displayDetails() {
     super.displayDetails();
     System.out.println("Platform    : " + platform);
     System.out.println("Recorded    : " + isRecorded);
 }
}
