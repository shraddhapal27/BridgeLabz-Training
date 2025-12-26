import java.util.Scanner;

public class MetroSmartCard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial smart card balance: ");
        int balance = sc.nextInt();

        while (balance > 0) {

            System.out.print("\nEnter distance travelled (km): ");
            int distance = sc.nextInt();

            // Fare calculation using ternary operator
            int fare = (distance <= 5) ? 10 :
                       (distance <= 15) ? 20 : 30;

            if (balance >= fare) {
                balance = balance - fare;
                System.out.println("Fare deducted: ₹" + fare);
                System.out.println("Remaining balance: ₹" + balance);
            } else {
                System.out.println("Insufficient balance!");
                break;
            }

            System.out.print("Do you want to travel again? (1 = Yes, 0 = No): ");
            int choice = sc.nextInt();

            if (choice == 0) {
                break;
            }
        }

        System.out.println("\nThank you for using Delhi Metro!");
        sc.close();
    }
}
