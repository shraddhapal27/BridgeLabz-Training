// create a program to calculate the factorial of an integer\
import java.util.*;
class Factorial{
  public static void main(String args[]){
    
	// create a Scanner object
	Scanner sc = new Scanner(System.in);
	
	// take input from the user 
	int number = sc.nextInt();
	
	int factorial =1;
	if(number > 0){
		while(number > 0){
			factorial = factorial * number;
			number--;
		}
	}
	else{
		System.out.print("Not a natural number");
	}
	System.out.print(factorial);
	
	sc.close();
  }
}