import java.util.Scanner;

public class CoffeeCounter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // GST percentage
        final double GST_RATE = 0.05; // 5% GST

        // Continue serving customers until user types "exit"
        while (true) {

            System.out.println("\nEnter coffee type: \n 1.espresso \n 2.latte \n 3.cappuccino");
            String coffeeType = sc.next().toLowerCase();

            // Exit condition
            if (coffeeType.equals("exit")) {
                System.out.println("Thank you for visiting Ravi's Café ");
                break;
            }

            double pricePerCup = 0.0;

            // Select coffee price using switch
            switch (coffeeType) {
                case "espresso":
                    pricePerCup = 120;
                    break;
                case "latte":
                    pricePerCup = 150;
                    break;
                case "cappuccino":
                    pricePerCup = 180;
                    break;
                default:
                    System.out.println("Invalid coffee type! Please try again.");
                    continue; // Skip rest and ask again
            }

            // Quantity input
            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            // Bill calculation
            double totalPrice = pricePerCup * quantity;
            double gstAmount = totalPrice * GST_RATE;
            double finalBill = totalPrice + gstAmount;

            // Display bill
            System.out.println(" BILL DETAILS ");
            System.out.println("Coffee Type : " + coffeeType);
            System.out.println("Quantity    : " + quantity);
            System.out.println("Base Price  : " + totalPrice);
            System.out.println("GST (5%)    : " + gstAmount);
            System.out.println("Total Bill  : " + finalBill);
        }

        sc.close();
    }
}
