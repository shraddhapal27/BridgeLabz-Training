package com.Day6.problem1;

import java.util.Scanner;

public class ManageArtExpo {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the number of artists: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
      for(int i=0; i<n; i++) {
    	  System.out.print("Enter the registearation time in a 24 hour format: ");
    	arr[i] = sc.nextInt();
      }
     System.out.println("Registeration time before sorting: "); 
     BoothTimeSorting.display(arr);
     
     System.out.println("Registeration time after sorting: "); 
     BoothTimeSorting.insertionSort(arr);
     BoothTimeSorting.display(arr);
    }
}
