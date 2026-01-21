package com.javacollections.queue;

//Question:
//Reverse a queue using only queue operations

import java.util.*;

public class ReverseQueue {

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Queue<Integer> q = new LinkedList<>();

     System.out.print("Enter number of elements: ");
     int n = sc.nextInt();

     for (int i = 0; i < n; i++) {
         q.add(sc.nextInt());
     }

     Queue<Integer> temp = new LinkedList<>();

     // Reverse logic
     while (!q.isEmpty()) {
         int x = q.remove();
         temp.add(x);
         for (int i = 0; i < temp.size() - 1; i++) {
             temp.add(temp.remove());
         }
     }

     System.out.println("Reversed Queue: " + temp);
     sc.close();
 }
}

