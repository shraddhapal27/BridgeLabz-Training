/*
. Shopkeeper’s Discount Dashboard 🛍️
A shopkeeper gives discounts based on total bill:
● Input item prices in a for-loop.
● Use if-else for discount logic.
● Use proper indentation, constants, and comments.
*/

import java.util.Scanner;

public class ShopkeepersDiscount{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number of items: ");
	int item = sc.nextInt();
	double[] prices = new double[item];
	double sum = 0;
	
	for(int i=0; i<prices.length; i++){
	System.out.println("Enter the price of item: " + (i+1));
	  prices[i] = sc.nextDouble();
	  sum += prices[i];
	  if(prices[i] < 0){
		  System.out.println("Enter a valid price");
		  i--;
	  }
	}
	
	if(sum >= 3000){
		System.out.println("The total amount is " + sum + "\nThere will be a discount of 25%    \nThe discount price is : " + (sum*0.25) + "\nThe amount to be payed : " + (sum - (sum*0.25)));
	}else if(sum <= 1500){
		System.out.println("The total amount is " + sum + "\nThere will be a discount of 10%   \nThe discount price is : " + (sum*0.1) + "\nThe amount to be payed : " + (sum - (sum*0.1)));
	}
	else{
		System.out.println("No discount");
	}
  }
}