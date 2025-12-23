import java.util.Scanner;

public class CharFrequencyWithUnique {

    // Method to find unique characters in a string
    public static char[] uniqueCharacters(String str) {
        int len = str.length();
        char[] temp = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            boolean isUnique = true;

            // Check if character has appeared before
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount++] = ch;
            }
        }

        // Create a new array of exact size to store unique characters
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    // Method to find frequency of characters using unique characters
    public static String[][] findCharFrequency(String str) {
        char[] uniqueChars = uniqueCharacters(str);
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            char ch = uniqueChars[i];
            int count = 0;

            // Count frequency of character in the string
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            result[i][0] = String.valueOf(ch);
            result[i][1] = String.valueOf(count);
        }

        return result;
    }

    // Method to display frequency table
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
