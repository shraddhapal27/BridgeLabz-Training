import java.util.Scanner;

public class CharFrequencyNestedLoops {

    // Method to find frequency of characters using nested loops
    public static String[] findCharFrequency(String str) {
        char[] chars = str.toCharArray();
        int len = chars.length;
        int[] freq = new int[len];

        // Initialize frequency array
        for (int i = 0; i < len; i++) {
            freq[i] = 1;
        }

        // Nested loop to count frequency
        for (int i = 0; i < len; i++) {
            if (chars[i] == '0') {
                continue; // Skip already counted duplicates
            }
            for (int j = i + 1; j < len; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // Mark duplicate
                }
            }
        }

        // Count non-zero characters to size the result array
        int uniqueCount = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') {
                uniqueCount++;
            }
        }

        // Create 1D array to store character and frequency as strings
        String[] result = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " : " + freq[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = sc.nextLine();

        String[] frequency = findCharFrequency(text);

        System.out.println("\nCharacter Frequencies:");
        for (String s : frequency) {
            System.out.println(s);
        }

        sc.close();
    }
}
