import java.util.Scanner;

public class StringComparison {

    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String s1, String s2) {

        // If lengths are different, strings are not equal
        if (s1.length() != s2.length()) {
            return false;
        }

        // Compare characters one by one
        for (int i = 0; i < s1.length(); i++) {
            if                                                                 (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        // Comparison using charAt()
        boolean resultUsingCharAt = compareUsingCharAt(str1, str2);

        // Comparison using built-in equals()
        boolean resultUsingEquals = str1.equals(str2);

        // Displaying results
        System.out.println("Result using charAt(): " + resultUsingCharAt);
        System.out.println("Result using equals(): " + resultUsingEquals);

        // Checking if both results are same
        if (resultUsingCharAt == resultUsingEquals) {
            System.out.println("Both comparison results are SAME");
        } else {
            System.out.println("Comparison results are DIFFERENT");
        }

        sc.close();
    }
}
