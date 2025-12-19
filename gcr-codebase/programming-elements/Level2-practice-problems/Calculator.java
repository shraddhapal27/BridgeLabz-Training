// import statement
import java.util.*;

// create a class to perform basic calculations
class Calculator{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
	
	float number1 = sc.nextFloat();
	float number2 = sc.nextFloat();
	
	// create variable sum and assign value of sum in it
	float sum = number1 + number2;
	
	// create variable sum and assign value of sum in it
	float difference = number1 - number2;
	
	// create variable sum and assign value of sum in it
	float product = number1 * number2;
	
	// create variable sum and assign value of sum in it
	float division = number1 / number2;
	
	System.out.print("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + sum 
	+ " , " + difference + " , " + product + " , " + division );
  }
}