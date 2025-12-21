import java.util.Scanner;

public class NumberChecker2{

    // Method to count digits
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Method to store digits in array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int index = count - 1;

        while (number != 0) {
            digits[index] = number % 10;
            number /= 10;
            index--;
        }
        return digits;
    }

    // Method to find sum of digits
    public static int findSumOfDigits(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }
        return sum;
    }

    // Method to find sum of squares of digits
    public static int findSumOfSquares(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(digits[i], 2);
        }
        return sum;
    }

    // Method to check Harshad Number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = findSumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find frequency of each digit
    public static int[][] findDigitFrequency(int[] digits) {
        int[][] freq = new int[10][2];

        // Initialize digit column
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }

        // Count frequency
        for (int i = 0; i < digits.length; i++) {
            freq[digits[i]][1]++;
        }

        return freq;
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int[] digits = storeDigits(number);

        System.out.print("Digits: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();

        System.out.println("Count of Digits: " + countDigits(number));
        System.out.println("Sum of Digits: " + findSumOfDigits(digits));
        System.out.println("Sum of Squares of Digits: " + findSumOfSquares(digits));
        System.out.println("Is Harshad Number: " + isHarshadNumber(number, digits));

        int[][] frequency = findDigitFrequency(digits);

        System.out.println("Digit Frequency:");
        System.out.println("Digit  Frequency");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println(frequency[i][0] + "        " + frequency[i][1]);
            }
        }

        sc.close();
    }
}
