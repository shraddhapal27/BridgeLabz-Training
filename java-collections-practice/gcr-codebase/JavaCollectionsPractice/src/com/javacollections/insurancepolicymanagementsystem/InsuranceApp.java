package com.javacollections.insurancepolicymanagementsystem;

//Main class

import java.util.Scanner;

public class InsuranceApp {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     PolicyManager manager = new PolicyManager();

     System.out.print("Enter number of policies: ");
     int n = sc.nextInt();

     // Input policies
     for (int i = 0; i < n; i++) {
         int no = sc.nextInt();
         String name = sc.next();
         String date = sc.next();
         String cover = sc.next();
         double premium = sc.nextDouble();

         Policy p = new Policy(no, name, date, cover, premium);
         manager.addPolicy(p);
     }

     manager.showAllPolicies();
     manager.showExpiringSoon();

     System.out.print("\nEnter coverage type to search: ");
     String type = sc.next();
     manager.showByCoverage(type);

     manager.showDuplicates();
     manager.comparePerformance();

     sc.close();
 }
}

