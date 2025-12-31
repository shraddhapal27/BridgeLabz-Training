/*
Festival Lucky Draw 🎉
At Diwali mela, each visitor draws a number.
● If the number is divisible by 3 and 5, they win a gift.
● Use if, modulus, and loop for multiple visitors.
● continue if input is invalid.
*/

import java.util.Scanner;

public class FestivalLuckyDraw {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Diwali Festival Lucky Draw ");

        System.out.print("Enter number of visitors: ");
        int visitors = sc.nextInt();

        for (int i = 1; i <= visitors; i++) {

            System.out.print("\nVisitor " + i + ", draw your lucky number: ");
            int number = sc.nextInt();

            // Invalid input check
            if (number <= 0) {
                System.out.println(" Invalid number! Skipping this visitor.");
                continue;
            }

            // Winning condition
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println(" Congratulations! You won a gift!");
            } else {
                System.out.println("Better luck next time!");
            }
        }

        System.out.println("\n Thank you for visiting the Diwali Mela ");
        sc.close();
    }
}
