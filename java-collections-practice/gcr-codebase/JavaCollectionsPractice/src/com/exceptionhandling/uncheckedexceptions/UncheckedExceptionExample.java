package com.exceptionhandling.uncheckedexceptions;

import java.util.Scanner;
import java.util.InputMismatchException;

public class UncheckedExceptionExample {
    public static void main(String[] args) {
    	
    	
    	try {
    		Scanner sc = new Scanner(System.in);
    		
    		System.out.println("Enter number a: ");
        	int a = sc.nextInt();
        	System.out.println("Enter number b: ");
        	int b = sc.nextInt();
    		int result = a/b;
    		System.out.println("result: " + result);
    	}
    	catch(ArithmeticException e) {
    		System.out.println("Cannot divide by zero");
    	}
    	catch(InputMismatchException e) {
    		System.out.println("Enter a valid numberrr");
    	}
    	
    }
}
