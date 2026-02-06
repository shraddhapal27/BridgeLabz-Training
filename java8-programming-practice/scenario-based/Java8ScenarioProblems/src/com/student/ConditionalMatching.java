package com.Day1.problem2;

import java.util.List;

public class ConditionalMatching {
    public static void main(String[] args) {
    	List<Student> list = StudentData.getStudent();
    	//1.Check if any student belongs to Biotech Engineering
  boolean hasBiotechStudent = list.stream().anyMatch(s -> s.getDepartment().equalsIgnoreCase("Biotech Engineering"));
    System.out.println("Any biotech student : " + hasBiotechStudent);	
    
    // 2. Check if all students are above age 20
  boolean hasAgeAbove20 =  list.stream().anyMatch(s -> s.getAge() > 20);
    System.out.println("Any student's age above 20?" + hasAgeAbove20);
    
    //   3.Check if no student belongs to Civil Engineering.
      boolean noCivilStudent = list.stream().noneMatch(s -> s.getDepartment().equalsIgnoreCase("Civil Engineering"));
      System.out.println("No civil student?"+ noCivilStudent );
    }
}
