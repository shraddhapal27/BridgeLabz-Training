// Create a program to calculate the factorial of a number using for loop

import java.util.*;
class FactorialUsingFor{
	public static void main(String args[]){
		
		// Create a Scanner object
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int factorial = 1;
		if(number > 0){
			for(int i=1; i <=number; i++){
				factorial = factorial*i;
			}
		}else{
			
			System.out.print("Not a natural number ! ");
		}
		System.out.print(factorial);
	}
}