// create a program to calculate sum of numbers

import java.util.*;

public class SumOfNumbers{
  public static void main(String args[]){
    
	Scanner sc = new Scanner(System.in);
	
	double total = 0.0;
	
	double variable = sc.nextDouble();
	
	while(variable !=0){
		total += variable;
		variable = sc.nextDouble();
	}
	System.out.print(total);
  }
}