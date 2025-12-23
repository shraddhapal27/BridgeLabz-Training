import java.util.Scanner;

public class UppercaseConversion {

    // Method 1: Convert string to uppercase using ASCII logic
    public static String convertToUpper(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); // convert to uppercase
            }
            result += ch;
        }
        return result;
    }

    // Method 2: Compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Built-in uppercase
        String builtInUpper = text.toUpperCase();

        // User-defined uppercase
        String userUpper = convertToUpper(text);

        // Compare both
        boolean result = compareStrings(builtInUpper, userUpper);

        // Display results
        System.out.println("Built-in uppercase: " + builtInUpper);
        System.out.println("User-defined uppercase: " + userUpper);
        System.out.println("Are both uppercase results same? " + result);

        sc.close();
    }
}
