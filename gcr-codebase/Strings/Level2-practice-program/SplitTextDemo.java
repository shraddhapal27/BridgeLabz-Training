import java.util.Scanner;

public class SplitTextDemo {

    // Method 1: Find string length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method 2: Split text into words using charAt() without split()
    public static String[] splitText(String text) {
        int length = findLength(text);

        // Count number of words
        int wordCount = 1; // at least 1 word
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store indexes of spaces
        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index] = i;
                index++;
            }
        }

        // Extract words using indexes
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount; i++) {
            int end;
            if (i < wordCount - 1) {
                end = spaceIndexes[i];
            } else {
                end = length;
            }
            String word = "";
            for (int j = start; j < end; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
            start = end + 1; // next word starts after space
        }

        return words;
    }

    // Method 3: Compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // User-defined split
        String[] userWords = splitText(text);

        // Built-in split
        String[] builtInWords = text.split(" ");

        // Compare both arrays
        boolean result = compareArrays(userWords, builtInWords);

        // Display results
        System.out.print("User-defined words: ");
        for (String word : userWords) {
            System.out.print(word + " ");
        }
        System.out.println();

        System.out.print("Built-in words: ");
        for (String word : builtInWords) {
            System.out.print(word + " ");
        }
        System.out.println();

        System.out.println("Do both arrays match? " + result);

        sc.close();
    }
}
