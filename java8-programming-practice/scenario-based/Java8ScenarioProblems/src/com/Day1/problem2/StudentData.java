package com.Day1.problem2;

import java.util.Arrays;
import java.util.List;

public class StudentData {
    public static List<Student> getStudent() {
    	return 
    			
    			 Arrays.asList(
    	                 new Student(1, "Rahul", 26, "Male", "Mumbai", 45, "Mechanical Engineering", "9876543210"),
    	                 new Student(2, "Anita", 24, "Female", "Pune", 78, "Computer Science", "9123456780"),
    	                 new Student(3, "Vikram", 28, "Male", "Delhi", 30, "Mechanical Engineering", "9988776655"),
    	                 new Student(4, "Sneha", 22, "Female", "Mumbai", 60, "Electrical", "9090909090"),
    	                 new Student(5, "Arjun", 27, "Male", "Bangalore", 20, "Mechanical Engineering", "9191919191")
    			);
    			
    }
}
