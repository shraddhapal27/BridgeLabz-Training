package com.javacollections.map;
//Question:
//Find key having maximum value

import java.util.*;

public class MaxValueKey {

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     Map<String, Integer> map = new HashMap<>();
     System.out.print("Enter number of entries: ");
     int n = sc.nextInt();

     for (int i = 0; i < n; i++) {
         map.put(sc.next(), sc.nextInt());
     }

     String maxKey = "";
     int maxValue = Integer.MIN_VALUE;

     // Find max
     for (String key : map.keySet()) {
         if (map.get(key) > maxValue) {
             maxValue = map.get(key);
             maxKey = key;
         }
     }

     System.out.println("Key with highest value: " + maxKey);
     sc.close();
 }
}
