import java.util.Scanner;

public class CharacterTypeChecker {

    // Method to check if a character is Vowel, Consonant, or Not a Letter
    public static String checkChar(char ch) {
        // Convert uppercase to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if it is a letter
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method to find vowels and consonants in a string and return a 2D array
    public static String[][] getCharTypes(String str) {
        String[][] result = new String[str.length()][2];

        for (int i = 0; i < str.length(); i++) {
            result[i][0] = String.valueOf(str.charAt(i)); // Store character
            result[i][1] = checkChar(str.charAt(i));      // Store type
        }

        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayCharTypes(String[][] charTypes) {
        System.out.println("\nCharacter\tType");
        System.out.println("---------------------");

        for (int i = 0; i < charTypes.length; i++) {
            System.out.println(charTypes[i][0] + "\t\t" + charTypes[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.nextLine();

        String[][] charTypes = getCharTypes(text);  // Get characters and their types
        displayCharTypes(charTypes);                // Display in tabular format

        sc.close();
    }
}
