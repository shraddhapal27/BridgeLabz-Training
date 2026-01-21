package com.javacollections.map;

//Question:
//Merge two maps and sum common keys

import java.util.*;

public class MergeMaps {

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     Map<String, Integer> map1 = new HashMap<>();
     Map<String, Integer> map2 = new HashMap<>();

     System.out.print("Enter size of Map1: ");
     int n1 = sc.nextInt();
     for (int i = 0; i < n1; i++) {
         map1.put(sc.next(), sc.nextInt());
     }

     System.out.print("Enter size of Map2: ");
     int n2 = sc.nextInt();
     for (int i = 0; i < n2; i++) {
         map2.put(sc.next(), sc.nextInt());
     }

     // Merge logic
     for (String key : map2.keySet()) {
         if (map1.containsKey(key)) {
             map1.put(key, map1.get(key) + map2.get(key));
         } else {
             map1.put(key, map2.get(key));
         }
     }

     System.out.println("Merged Map: " + map1);
     sc.close();
 }
}

