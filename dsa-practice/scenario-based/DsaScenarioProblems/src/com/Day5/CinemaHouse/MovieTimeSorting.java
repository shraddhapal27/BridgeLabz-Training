package com.Day5.CinemaHouse;

import java.util.Scanner;

public class MovieTimeSorting { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of movies : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			System.out.println("Enter your movie time in a 24 hour format: ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Before sorting movie time : ");
		Timings.display(arr);
		
		System.out.println("After sorting movie time : ");
		Timings.bubbleSort(arr);
		Timings.display(arr);
	}
}