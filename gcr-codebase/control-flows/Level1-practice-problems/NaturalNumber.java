// create a java program to check for natural number and calculating their sum

import java.util.*;
class NaturalNumber{
  public static void main(String args[]){
	  
	// Create a Scanner object
    Scanner sc = new Scanner(System.in);
	
	// take input from user 
	int n = sc.nextInt();
	
	// check whether the number is a natural number
	if(n > 0){
		
		// calculate its sum
		int sum = n*(n+1)/2;
		System.out.print("The sum of " + n + " natural numbers is " + sum);
	}
	else{
		System.out.print("The number " + n + "is not a natural number");
	}
	
	sc.close();
  }
}