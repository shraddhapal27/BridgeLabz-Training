import java.util.Scanner;

public class LowercaseConversion {

    // Method 1: Convert string to lowercase using ASCII logic
    public static String convertToLower(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); // convert to lowercase
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

        // Built-in lowercase
        String builtInLower = text.toLowerCase();

        // User-defined lowercase
        String userLower = convertToLower(text);

        // Compare both
        boolean result = compareStrings(builtInLower, userLower);

        // Display results
        System.out.println("Built-in lowercase: " + builtInLower);
        System.out.println("User-defined lowercase: " + userLower);
        System.out.println("Are both lowercase results same? " + result);

        sc.close();
    }
}
