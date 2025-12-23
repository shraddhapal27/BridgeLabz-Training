import java.util.Scanner;

public class CustomTrim {

    // Method to find start and end index after trimming spaces
    public static int[] getTrimIndexes(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Trim leading spaces
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    public static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with leading and trailing spaces:");
        String text = sc.nextLine();

        // Get trimmed indexes
        int[] indexes = getTrimIndexes(text);

        // Get trimmed string using custom substring
        String trimmedText = customSubstring(text, indexes[0], indexes[1]);

        // Trim using built-in method
        String builtInTrimmed = text.trim();

        // Compare both
        boolean isEqual = compareStrings(trimmedText, builtInTrimmed);

        // Display results
        System.out.println("\nOriginal Text: \"" + text + "\"");
        System.out.println("Trimmed Text (custom method): \"" + trimmedText + "\"");
        System.out.println("Trimmed Text (built-in trim): \"" + builtInTrimmed + "\"");
        System.out.println("Are both trimmed strings equal? " + isEqual);

        sc.close();
    }
}
