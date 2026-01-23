package com.exceptionhandling.finallyblock;

import java.util.Scanner;

public class FinallyBlockExample {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	try {
    	   int a = sc.nextInt();
    	   int b = sc.nextInt();
    	   int result = a/b;
    	   
    	}
    	catch(ArithmeticException e ) {
    		System.out.println("cannot divide by zero");
    	}
    	finally {
    		System.out.println("operation completed.");
    		sc.close();
    	}
    }
}
