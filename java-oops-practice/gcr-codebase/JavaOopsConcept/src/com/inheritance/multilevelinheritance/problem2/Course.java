package com.inheritance.multilevelinheritance.problem2;

//Base class
class Course {
 String courseName;
 int duration; // in weeks

 // Constructor
 Course(String courseName, int duration) {
     this.courseName = courseName;
     this.duration = duration;
 }

 void displayDetails() {
     System.out.println("Course Name : " + courseName);
     System.out.println("Duration    : " + duration + " weeks");
 }
}
