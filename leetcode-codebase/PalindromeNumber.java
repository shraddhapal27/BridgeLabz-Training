import java.util.Scanner;

public class PalindromeNumber {

    // Method to check palindrome
    public static boolean isPalindrome(int x) {

        // Negative numbers are not palindrome
        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        // Reverse the number
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }

        // Compare original and reversed
        return original == reversed;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        boolean result = isPalindrome(x);

        System.out.println("Is Palindrome? " + result);

        sc.close();
    }
}
