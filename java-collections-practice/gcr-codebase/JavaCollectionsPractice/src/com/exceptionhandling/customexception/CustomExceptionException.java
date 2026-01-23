package com.exceptionhandling.customexception;

import java.util.Scanner;
public class CustomExceptionException {
	
	public static void validateAge(int age) throws InvalidAgeException {
		if(age < 18) {
			throw new InvalidAgeException("Age must be 18 or above");
		}else {
			System.out.println("Acccess granted");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {	
			int age = sc.nextInt();
			validateAge(age);
		}
		catch(InvalidAgeException e ) {
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
	}
}
