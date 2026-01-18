package com.Day6.problem3;

public class Main {
	 public static void main(String[] args) {
	        int[] flavorSales = {120, 300, 180, 90, 250, 60, 200, 150};

	        System.out.println("Before Sorting:");
	        IceCreamRush.display(flavorSales);

	        IceCreamRush.bubbleSort(flavorSales);

	        System.out.println("After Sorting:");
	        IceCreamRush.display(flavorSales);
	    }
}
