import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        boolean isPrime = true;

        // Check for valid number
        if (number <= 1) {
            isPrime = false;
        } else {
            // Check divisibility
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Output
        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }

        sc.close();
    }
}
