package com.javacollections.set;

//Question:
//Check if two sets contain same elements

import java.util.*;

public class CheckSetEqual {

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     Set<Integer> set1 = new HashSet<>();
     Set<Integer> set2 = new HashSet<>();

     System.out.print("Enter size of Set1: ");
     int n1 = sc.nextInt();
     System.out.println("Enter elements of Set1:");
     for (int i = 0; i < n1; i++) {
         set1.add(sc.nextInt());
     }

     System.out.print("Enter size of Set2: ");
     int n2 = sc.nextInt();
     System.out.println("Enter elements of Set2:");
     for (int i = 0; i < n2; i++) {
         set2.add(sc.nextInt());
     }

     System.out.println("Sets are equal: " + set1.equals(set2));
     sc.close();
 }
}
