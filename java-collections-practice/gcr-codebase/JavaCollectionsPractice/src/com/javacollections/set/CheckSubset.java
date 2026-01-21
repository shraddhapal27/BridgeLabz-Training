package com.javacollections.set;

//Question:
//Check if one set is subset of another

import java.util.*;

public class CheckSubset {

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     Set<Integer> set1 = new HashSet<>();
     Set<Integer> set2 = new HashSet<>();

     System.out.print("Enter size of Set1: ");
     int n1 = sc.nextInt();
     for (int i = 0; i < n1; i++) {
         set1.add(sc.nextInt());
     }

     System.out.print("Enter size of Set2: ");
     int n2 = sc.nextInt();
     for (int i = 0; i < n2; i++) {
         set2.add(sc.nextInt());
     }

     System.out.println("Set1 is subset of Set2: " + set2.containsAll(set1));
     sc.close();
 }
}
