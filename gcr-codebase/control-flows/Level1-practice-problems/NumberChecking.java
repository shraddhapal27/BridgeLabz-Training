// create a program to check whether a number is positive, negative or zero

import java.util.*;
class NumberChecking{
  public static void main(String args[]){
  
  // create a Scanner object
  Scanner sc = new Scanner(System.in);
  
    int var = sc.nextInt();
	
	// condition to check the number
    if(var > 0){
	System.out.print("The given number is Positive");
	}else if(var < 0){
	System.out.print("The given number is Negative");
	}	else{
	System.out.print("The given number is Zero");
	}
	
	sc.close();
  }
}