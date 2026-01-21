package com.javacollections.list;

//Question:
//Find frequency of each element in a list

import java.util.*;

public class FrequencyOfElements {

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     // Input size
     System.out.print("Enter number of words: ");
     int n = sc.nextInt();

     List<String> list = new ArrayList<>();
     System.out.println("Enter words:");
     for (int i = 0; i < n; i++) {
         list.add(sc.next());
     }

     Map<String, Integer> map = new HashMap<>();

     // Count frequency
     for (String s : list) {
         if (map.containsKey(s)) {
             map.put(s, map.get(s) + 1);
         } else {
             map.put(s, 1);
         }
     }

     System.out.println("Frequency: " + map);
     sc.close();
 }
}

