package com.javacollections.map;

//Question:
//Group employees by department using Map

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GroupByDepartment {

 // Employee class
 static class Employee {
     String name;
     String dept;

     Employee(String name, String dept) {
         this.name = name;
         this.dept = dept;
     }
 }

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     List<Employee> list = new ArrayList<>();

     System.out.print("Enter number of employees: ");
     int n = sc.nextInt();

     // Input employees
     for (int i = 0; i < n; i++) {
         System.out.print("Enter name: ");
         String name = sc.next();
         System.out.print("Enter department: ");
         String dept = sc.next();

         list.add(new Employee(name, dept));
     }

     Map<String, List<Employee>> map = new HashMap<>();

     // Group by department
     for (Employee e : list) {
         if (!map.containsKey(e.dept)) {
             map.put(e.dept, new ArrayList<>());
         }
         map.get(e.dept).add(e);
     }

     // Display result
     System.out.println("\nEmployees by Department:");
     for (String d : map.keySet()) {
         System.out.print(d + ": ");
         for (Employee e : map.get(d)) {
             System.out.print(e.name + " ");
         }
         System.out.println();
     }

     sc.close();
 }
}
