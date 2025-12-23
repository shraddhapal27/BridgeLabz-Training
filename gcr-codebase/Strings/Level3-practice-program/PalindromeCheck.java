import java.util.Scanner;

public class PalindromeCheck {

    // LOGIC 1: Using loop (start & end index comparison)
    public static boolean isPalindromeLoop(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // LOGIC 2: Using recursion
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        // Base condition
        if (start >= end) {
            return true;
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Method to reverse string using charAt()
    public static char[] reverseString(String text) {
        char[] reverse = new char[text.length()];
        int index = 0;

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse[index++] = text.charAt(i);
        }
        return reverse;
    }

    // LOGIC 3: Using character arrays
    public static boolean isPalindromeArray(String text) {
        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a text:");
        String text = sc.nextLine();

        // Remove spaces and convert to lowercase
        text = text.replaceAll("\\s", "").toLowerCase();

        System.out.println("\nPalindrome Check Results:");

        // Logic 1
        System.out.println("Using Loop Method: " +
                (isPalindromeLoop(text) ? "Palindrome" : "Not Palindrome"));

        // Logic 2
        System.out.println("Using Recursive Method: " +
                (isPalindromeRecursive(text, 0, text.length() - 1)
                        ? "Palindrome" : "Not Palindrome"));

        // Logic 3
        System.out.println("Using Character Array Method: " +
                (isPalindromeArray(text) ? "Palindrome" : "Not Palindrome"));

        sc.close();
    }
}
