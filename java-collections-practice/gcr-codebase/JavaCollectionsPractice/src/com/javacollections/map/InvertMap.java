package com.javacollections.map;

//Question:
//Invert Map<K,V> to Map<V,List<K>>

import java.util.*;

public class InvertMap {

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     Map<String, Integer> map = new HashMap<>();
     System.out.print("Enter number of entries: ");
     int n = sc.nextInt();

     for (int i = 0; i < n; i++) {
         String key = sc.next();
         int value = sc.nextInt();
         map.put(key, value);
     }

     Map<Integer, List<String>> result = new HashMap<>();

     // Invert logic
     for (String key : map.keySet()) {
         int val = map.get(key);

         if (!result.containsKey(val)) {
             result.put(val, new ArrayList<>());
         }
         result.get(val).add(key);
     }

     System.out.println("Inverted Map: " + result);
     sc.close();
 }
}
