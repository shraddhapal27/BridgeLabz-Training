import java.util.Scanner;

public class PhoneRechargeSimulator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 1000;   // initial wallet balance
        char repeat;

        do {
            System.out.println("\nCurrent Balance: " + balance);
            System.out.println("Choose Mobile Operator:");
            System.out.println("1. Jio");
            System.out.println("2. Airtel");
            System.out.println("3. VI");
            System.out.println("4. BSNL");

            int operator = sc.nextInt();

            System.out.print("Enter recharge amount: ₹");
            double amount = sc.nextDouble();

            if (amount > balance) {
                System.out.println(" Insufficient balance!");
            } else {
                balance -= amount;

                switch (operator) {
                    case 1:
                        System.out.println(" Jio Recharge Successful");
                        System.out.println("Offer: 2GB/day for 28 days");
                        break;

                    case 2:
                        System.out.println(" Airtel Recharge Successful");
                        System.out.println("Offer: 1.5GB/day + Unlimited Calls");
                        break;

                    case 3:
                        System.out.println(" VI Recharge Successful");
                        System.out.println("Offer: Weekend Data Rollover");
                        break;

                    case 4:
                        System.out.println(" BSNL Recharge Successful");
                        System.out.println("Offer: Extra Validity");
                        break;

                    default:
                        System.out.println(" Invalid Operator!");
                        balance += amount; // refund
                }
            }

            System.out.println("Remaining Balance: ₹" + balance);
            System.out.print("Do you want to recharge again? (y/n): ");
            repeat = sc.next().charAt(0);

        } while (repeat == 'y' || repeat == 'Y');

        System.out.println("\nThank you for using Phone Recharge Simulator ");
        sc.close();
    }
}
