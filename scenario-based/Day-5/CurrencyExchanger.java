/*
Currency Exchange Kiosk 💱
Design a currency converter:
● Take INR amount and target currency.
● Use a switch to apply the correct rate.
● Ask if the user wants another conversion (do-while).
*/

import java.util.Scanner;
public class CurrencyExchanger{
    public static void main(String[] args){
	
        Scanner sc = new Scanner(System.in);
		System.out.println("-----------------------------------");
		System.out.println("Welcome to Currency exchange system");
		System.out.println("-----------------------------------");
		System.out.println("----------------------------------");
		System.out.println("Choose the country ");
		System.out.println("1. US");
		System.out.println("2. Canada");
		System.out.println("3. Israel");
		System.out.println("4. Pakistan");
		
		
		int choice = sc.nextInt();
		System.out.println("Enter the amount to exchange: ");
		double INR = sc.nextDouble();
		double convertedAmount = 0;
		
		switch(choice){
		
		    case 1: 
			convertedAmount = (INR * 0.011132);
			System.out.println("The indian rupee amount in US is: " + convertedAmount);
			break;
			
			case 2: 
			convertedAmount = (INR * 0.015251);
			System.out.println("The indian rupee amount in Canada is: " + convertedAmount);
			break;
			
			case 3:
			convertedAmount = (INR * 0.035377);
			System.out.println("The indian rupee amount in Israel is: " + convertedAmount);
			break;
			
			case 4:
			convertedAmount = (INR * 3.123811);
			System.out.println("The indian rupee amount in Pakistan is: " + convertedAmount);
			break;
			
			default:
			System.out.println("Enter the valid amount");
		}
	System.out.println("Thank you for using the currency exchanger system");
	}
}


