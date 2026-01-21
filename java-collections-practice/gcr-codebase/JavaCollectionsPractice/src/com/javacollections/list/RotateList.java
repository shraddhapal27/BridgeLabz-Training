package com.javacollections.list;

//Question:
//Rotate list elements by given positions

import java.util.*;

public class RotateList {

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter number of elements: ");
     int n = sc.nextInt();

     List<Integer> list = new ArrayList<>();
     System.out.println("Enter elements:");
     for (int i = 0; i < n; i++) {
         list.add(sc.nextInt());
     }

     System.out.print("Rotate by: ");
     int k = sc.nextInt();
     k = k % n; // handle large rotation

     // Rotate manually
     for (int i = 0; i < k; i++) {
         int first = list.remove(0);
         list.add(first);
     }

     System.out.println("Rotated List: " + list);
     sc.close();
 }
}
