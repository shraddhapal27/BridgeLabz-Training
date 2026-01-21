package com.javacollections.map;
//Question:
//Count word frequency using HashMap

import java.util.*;

public class WordFrequency {

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter text:");
     String text = sc.nextLine();

     // Remove punctuation and convert to lowercase
     text = text.toLowerCase().replaceAll("[^a-z ]", "");

     String[] words = text.split(" ");
     Map<String, Integer> map = new HashMap<>();

     // Count words
     for (String w : words) {
         if (w.length() == 0) continue;

         if (map.containsKey(w)) {
             map.put(w, map.get(w) + 1);
         } else {
             map.put(w, 1);
         }
     }

     System.out.println("Word Frequency: " + map);
     sc.close();
 }
}
