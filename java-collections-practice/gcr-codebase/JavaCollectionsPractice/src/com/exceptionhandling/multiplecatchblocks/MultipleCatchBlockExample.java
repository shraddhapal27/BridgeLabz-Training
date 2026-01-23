package com.exceptionhandling.multiplecatchblocks;

import java.util.Scanner;

public class MultipleCatchBlockExample {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	try {
    		System.out.println("Enter the size of the array: ");
        	int n = sc.nextInt();
            int[] integers = new int[n];
            
            for(int i=0; i<integers.length; i++) {
            	
            	integers[i] = sc.nextInt();
            }
           
            int value = integers[11];
    	}
    	catch(ArrayIndexOutOfBoundsException e) {
    		System.out.println("Invalid index");
    	}
    	catch(NullPointerException e ) {
    		System.out.println("Array not initialized");
    	}
    	finally {
    		sc.close();
    	}
    }
}
