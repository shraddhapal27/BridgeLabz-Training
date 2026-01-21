package com.javacollections.insurancepolicymanagementsystem;
//Handles policy operations

import java.util.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PolicyManager {

 Set<Policy> hashSet = new HashSet<>();
 Set<Policy> linkedHashSet = new LinkedHashSet<>();
 Set<Policy> treeSet = new TreeSet<>();

 // Add policy to all sets
 void addPolicy(Policy p) {
     hashSet.add(p);
     linkedHashSet.add(p);
     treeSet.add(p);
 }

 // Display all unique policies
 void showAllPolicies() {
     System.out.println("\nAll Policies:");
     for (Policy p : hashSet) {
         System.out.println(p);
     }
 }

 // Policies expiring within 30 days
 void showExpiringSoon() {
     System.out.println("\nPolicies Expiring Soon:");
     LocalDate today = LocalDate.now();

     for (Policy p : hashSet) {
         LocalDate exp = LocalDate.parse(p.expiryDate);
         long days = ChronoUnit.DAYS.between(today, exp);

         if (days >= 0 && days <= 30) {
             System.out.println(p);
         }
     }
 }

 // Policies by coverage type
 void showByCoverage(String type) {
     System.out.println("\nPolicies with coverage: " + type);
     for (Policy p : hashSet) {
         if (p.coverageType.equalsIgnoreCase(type)) {
             System.out.println(p);
         }
     }
 }

 // Find duplicate policies
 void showDuplicates() {
     System.out.println("\nDuplicate Policies:");
     Set<Integer> seen = new HashSet<>();

     for (Policy p : linkedHashSet) {
         if (!seen.add(p.policyNo)) {
             System.out.println(p);
         }
     }
 }

 // Performance comparison
 void comparePerformance() {
     Policy p = hashSet.iterator().next();

     long start, end;

     start = System.nanoTime();
     hashSet.contains(p);
     end = System.nanoTime();
     System.out.println("\nHashSet search time: " + (end - start));

     start = System.nanoTime();
     linkedHashSet.contains(p);
     end = System.nanoTime();
     System.out.println("LinkedHashSet search time: " + (end - start));

     start = System.nanoTime();
     treeSet.contains(p);
     end = System.nanoTime();
     System.out.println("TreeSet search time: " + (end - start));
 }
}

