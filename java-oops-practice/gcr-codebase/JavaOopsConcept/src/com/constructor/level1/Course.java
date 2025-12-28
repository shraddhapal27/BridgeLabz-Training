package com.constructor.level1;

public class Course {
  String courseName;
  int duration;
  double fee;
  
  static  String instituteName = "Abc";
  
  Course(String courseName, int duration, double fee){
	  this.courseName = courseName;
	  this.duration = duration;
	  this.fee = fee;
  }
  
  public void displayCourseDetails() {
	  System.out.println("institute name : " + instituteName);
	  System.out.println("course name : " + courseName);
	  System.out.println("duration : " + duration);
	  System.out.println("fee : " + fee);
  }
  
  static void updateInstituteName(String newInstituteName) {
	  instituteName = newInstituteName;
  }
}
