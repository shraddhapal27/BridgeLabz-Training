package com.javacollections.list;
//Question:
//Remove duplicates while keeping original order

import java.util.*;

public class RemoveDuplicates {

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter number of elements: ");
     int n = sc.nextInt();

     List<Integer> list = new ArrayList<>();
     System.out.println("Enter elements:");
     for (int i = 0; i < n; i++) {
         list.add(sc.nextInt());
     }

     List<Integer> result = new ArrayList<>();

     // Manual duplicate check
     for (int x : list) {
         if (!result.contains(x)) {
             result.add(x);
         }
     }

     System.out.println("After removing duplicates: " + result);
     sc.close();
 }
}
