package com.javacollections.queue;

//Question:
//Circular buffer using array

import java.util.*;

public class CircularBuffer {

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter buffer size: ");
     int size = sc.nextInt();

     int[] buffer = new int[size];
     int index = 0;

     System.out.print("Enter number of elements: ");
     int n = sc.nextInt();

     for (int i = 0; i < n; i++) {
         buffer[index % size] = sc.nextInt();
         index++;
     }

     System.out.print("Buffer: ");
     for (int i = 0; i < size; i++) {
         System.out.print(buffer[i] + " ");
     }

     sc.close();
 }
}
