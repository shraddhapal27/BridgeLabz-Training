package com.Day1.problem2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BasicFilteringMapping {
    public static void main(String[] args) {
    	List<Student> list = StudentData.getStudent();
    
    	 
    	 // 1.Print all students whose rank is less than 50.
    	list.stream().filter(s ->s.getRank() < 50).forEach(System.out::println);
    	System.out.println("---------------");
    	
         // 2.Print all students whose age is greater than 25.
    	list.stream().filter(s -> s.getAge()> 25).forEach(System.out::println);
    	System.out.println("-----------------");
    	
    	// 3.Print the names of all students only.
    	list.stream().map(Student::getFirstName).forEach(System.out::println);
    	System.out.println("------------------");
    	
    	//4.Print all students belonging to Mechanical Engineering.
    	list.stream().filter(s -> "MechanicalEngineering".equalsIgnoreCase(s.getDepartment())).forEach(System.out::println);
    	System.out.println("-------------------");
    	
    	list.stream().filter(s -> !"Mumbai".equalsIgnoreCase(s.getCity())).forEach(System.out::println);
    	System.out.println("--------------------");
    }
}
