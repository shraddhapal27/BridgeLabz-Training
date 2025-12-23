import java.util.Scanner;

public class UniqueCharacters {

    // Method to find the length of a string without using length()
    public static int stringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // End of string reached
        }
        return count;
    }

    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String str) {
        int len = stringLength(str);
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

        // Create a new array of the exact size to store unique characters
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = sc.nextLine();

        char[] uniqueChars = findUniqueCharacters(text);

        System.out.println("\nUnique characters in the string:");
        for (char ch : uniqueChars) {
            System.out.print(ch + " ");
        }

        sc.close();
    }
}
