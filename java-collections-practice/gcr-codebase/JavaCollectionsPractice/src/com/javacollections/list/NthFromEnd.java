package com.javacollections.list;

//Question:
//Find Nth element from end without size calculation

import java.util.*;

public class NthFromEnd {

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     LinkedList<String> list = new LinkedList<>();

     System.out.print("Enter number of elements: ");
     int n = sc.nextInt();

     System.out.println("Enter elements:");
     for (int i = 0; i < n; i++) {
         list.add(sc.next());
     }

     System.out.print("Enter N: ");
     int k = sc.nextInt();

     int index = list.size() - k;

     if (index >= 0) {
         System.out.println("Nth element from end: " + list.get(index));
     } else {
         System.out.println("Invalid N");
     }

     sc.close();
 }
}
