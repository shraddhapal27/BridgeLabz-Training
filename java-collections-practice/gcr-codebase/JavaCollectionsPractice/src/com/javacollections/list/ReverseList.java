package com.javacollections.list;

//Question:
//Reverse the elements of a List without using built-in reverse methods

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ReverseList {

 // Method to reverse any List
 static void reverseList(List<Integer> list) {
     int i = 0;
     int j = list.size() - 1;

     // Swap elements
     while (i < j) {
         int temp = list.get(i);
         list.set(i, list.get(j));
         list.set(j, temp);
         i++;
         j--;
     }
 }

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     // Input size
     System.out.print("Enter number of elements: ");
     int n = sc.nextInt();

     // ArrayList input
     List<Integer> arrayList = new ArrayList<>();
     System.out.println("Enter elements for ArrayList:");
     for (int i = 0; i < n; i++) {
         arrayList.add(sc.nextInt());
     }

     // Reverse ArrayList
     reverseList(arrayList);
     System.out.println("Reversed ArrayList: " + arrayList);

     // LinkedList input
     List<Integer> linkedList = new LinkedList<>();
     System.out.println("Enter elements for LinkedList:");
     for (int i = 0; i < n; i++) {
         linkedList.add(sc.nextInt());
     }

     // Reverse LinkedList
     reverseList(linkedList);
     System.out.println("Reversed LinkedList: " + linkedList);

     sc.close();
 }
}
