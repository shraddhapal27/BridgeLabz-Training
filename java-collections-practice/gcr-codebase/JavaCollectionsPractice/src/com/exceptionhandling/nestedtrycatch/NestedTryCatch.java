package com.exceptionhandling.nestedtrycatch;

public class NestedTryCatch {
    public static void main(String[] args) {
    	int[] arr = {1,2,3,4,5,6,7,8,9};
    	int index = 2;
    	int divisor = 0;
    	
    	try {
    		   try {
    			int value = arr[index];
    			int result = value/divisor;
    			System.out.println("result "+ result);
    	}
    	catch(ArithmeticException e) {
    		System.out.println("cannot divide by zero");
    	}
      }
    	catch(ArrayIndexOutOfBoundsException e) {
    		System.out.println("Invalid array excess");
    	}
    }
}
