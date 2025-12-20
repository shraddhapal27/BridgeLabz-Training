import java.util.Scanner;

public class OddAndEvenNos {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check for natural number
        if (number < 1) {
            System.out.println("Error: Enter a natural number");
            return; // stop execution
        }

        int[] evenArray = new int[number / 2 + 1];
        int[] oddArray = new int[number / 2 + 1];

        int oddIndex = 0;
        int evenIndex = 0;

        // Loop from 1 to number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {   // FIXED CONDITION
                evenArray[evenIndex] = i;
                evenIndex++;
            } else {
                oddArray[oddIndex] = i;
                oddIndex++;
            }
        }

        System.out.println("Even Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenArray[i] + " ");
        }

        System.out.println("\nOdd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddArray[i] + " ");
        }

        sc.close();
    }
}
