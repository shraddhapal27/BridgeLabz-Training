import java.util.Scanner;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        // Edge case
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Take first string as reference
        String first = strs[0];

        // Loop through characters of first string
        for (int i = 0; i < first.length(); i++) {

            char ch = first.charAt(i);

            // Compare with other strings
            for (int j = 1; j < strs.length; j++) {

                // If index out of bounds or mismatch
                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    return first.substring(0, i);
                }
            }
        }

        return first;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] strs = new String[n];

        System.out.println("Enter strings:");
        for (int i = 0; i < n; i++) {
            strs[i] = sc.nextLine();
        }

        String result = longestCommonPrefix(strs);

        System.out.println("Longest Common Prefix: \"" + result + "\"");

        sc.close();
    }
}
