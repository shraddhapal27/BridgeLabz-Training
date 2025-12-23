import java.util.Scanner;

public class FirstNonRepeatingChar {

    // Method to find the first non-repeating character
    public static char findFirstNonRepeatingChar(String str) {
        int[] freq = new int[256]; // Array to store frequency of each ASCII character

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        // Find the first character with frequency 1
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }

        // Return a special value if no non-repeating character found
        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = sc.nextLine();

        char firstUnique = findFirstNonRepeatingChar(text);

        if (firstUnique != '\0') {
            System.out.println("The first non-repeating character is: " + firstUnique);
        } else {
            System.out.println("No non-repeating character found in the string.");
        }

        sc.close();
    }
}
