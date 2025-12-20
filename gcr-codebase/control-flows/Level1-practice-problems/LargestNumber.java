// Create a program to check the largest number

import java.util.*;
class LargestNumber{
  public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
	
	// take input numbers from the user
	int number1 = sc.nextInt();
	int number2 = sc.nextInt();
	int number3 = sc.nextInt();
	
    System.out.println("Is the number1 the largest" + (number1 > number2 && number1 > number3));
	 System.out.println("Is the number2 the largest" + (number2 > number1 && number2 > number3));
	  System.out.print("Is the number3 the largest" + (number3 > number1 && number3 > number2));
	
     sc.close();	
  }
}