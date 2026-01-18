package com.Day6.problem3;

public class IceCreamRush {

	    static void bubbleSort(int[] sales) {
	        int n = sales.length;

	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (sales[j] > sales[j + 1]) {
	                    // swap
	                    int temp = sales[j];
	                    sales[j] = sales[j + 1];
	                    sales[j + 1] = temp;
	                }
	            }
	        }
	    }

	    static void display(int[] sales) {
	        for (int sale : sales) {
	            System.out.print(sale + " ");
	        }
	        System.out.println();
	    }    
}
