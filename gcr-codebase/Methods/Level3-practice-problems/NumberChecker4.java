import java.util.Scanner;

public class NumberChecker4 {

    // Method to count digits
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number = number / 10;
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
            number = number / 10;
            index--;
        }
        return digits;
    }

    // Method to reverse digits array
    public static int[] reverseDigitsArray(int[] digits) {
        int[] reversed = new int[digits.length];
        int j = 0;

        for (int i = digits.length - 1; i >= 0; i--) {
            reversed[j] = digits[i];
            j++;
        }
        return reversed;
    }

    // Method to compare two arrays
    public static boolean compareArrays(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to check palindrome
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigitsArray(digits);
        return compareArrays(digits, reversed);
    }

    // Method to check Duck Number
    // Duck number → contains at least one non-zero digit
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 0) {
                return true;
            }
        }
        return false;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = storeDigits(number);

        System.out.print("Digits: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();

        int[] reversed = reverseDigitsArray(digits);

        System.out.print("Reversed Digits: ");
        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i] + " ");
        }
        System.out.println();

        System.out.println("Count of Digits: " + countDigits(number));
        System.out.println("Arrays Equal: " + compareArrays(digits, reversed));
        System.out.println("Is Palindrome: " + isPalindrome(digits));
