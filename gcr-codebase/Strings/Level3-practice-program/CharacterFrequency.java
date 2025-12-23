import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in a string
    public static String[][] findCharFrequency(String str) {
        int[] freq = new int[256]; // ASCII characters frequency array

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        // Count unique characters to create 2D array
        int uniqueCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] != 0) {
                uniqueCount++;
                freq[str.charAt(i)] = -freq[str.charAt(i)]; // Mark as counted
            }
        }

        // Create 2D array to store character and frequency
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch] < 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(-freq[ch]); // Convert back to positive
                index++;
                freq[ch] = 0; // Avoid recounting
            }
        }

        return result;
    }

    // Method to display the frequency table
    public static void displayFrequency(String[][] freqData) {
        System.out.println("\nCharacter\tFrequency");
        System.out.println("-------------------------");
        for (int i = 0; i < freqData.length; i++) {
            System.out.println(freqData[i][0] + "\t\t" + freqData[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = sc.nextLine();

        String[][] frequency = findCharFrequency(text);

        displayFrequency(frequency);

        sc.close();
    }
}
