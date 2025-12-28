package com.constructor.level1;

public class UseCourse {
  public static void main(String[] args) {
	  Course c1 = new Course("Java", 6, 40000);
	  Course c2 = new Course("Python", 5, 35000);
	  
	  c1.displayCourseDetails();
      System.out.println();

      c2.displayCourseDetails();
      System.out.println();
      

      // Update institute name for all courses
      Course.updateInstituteName("Tech Skills Academy");

      System.out.println("After Updating Institute Name:\n");

      c1.displayCourseDetails();
      System.out.println();

      c2.displayCourseDetails();
	  
  }
}
