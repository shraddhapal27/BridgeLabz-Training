// Creating a class to check the smallest number 

import java.util.*;
class SmallestNumber{
   public static void main(String args[]){
   
   // Create a Scanner object 
    Scanner sc = new Scanner(System.in);
	
	// take input numbers from the users 
	int number1 = sc.nextInt();
	int number2 = sc.nextInt();
	int number3 = sc.nextInt();
	
	// check if first is smallest of three or not
	System.out.print("Is the first number the smallest? " + (number1 < number2 && number1 < number3));
	
	sc.close();
   }
}