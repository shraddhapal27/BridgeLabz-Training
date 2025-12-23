import java.util.Scanner;

public class ShortestLongestWords {

    // Method to find length of a string without using length()
    public static int stringLength(String str) {
        int count = 0;
        while (true) {
            try {
                str.charAt(count);
                count++;
            } catch (IndexOutOfBoundsException e) {
                break;
            }
        }
        return count;
    }

    // Method to split a string into words using charAt()
    public static String[] splitIntoWords(String text) {
        int wordCount = 0;

        // Count number of words
        for (int i = 0; i < stringLength(text); i++) {
            if (text.charAt(i) != ' ' && (i == 0 || text.charAt(i - 1) == ' ')) {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int index = 0;
        String word = "";

        for (int i = 0; i < stringLength(text); i++) {
            char c = text.charAt(i);
            if (c != ' ') {
                word += c;
            }
            if ((c == ' ' || i == stringLength(text) - 1) && !word.equals("")) {
                words[index++] = word;
                word = "";
            }
        }

        return words;
    }

    // Method to create a 2D array of word and its length
    public static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(stringLength(words[i]));
        }
        return result;
    }

    // Method to find shortest and longest word lengths
    public static int[] findShortestLongest(String[][] wordLengths) {
        int minLength = Integer.parseInt(wordLengths[0][1]);
        int maxLength = Integer.parseInt(wordLengths[0][1]);
        String shortestWord = wordLengths[0][0];
        String longestWord = wordLengths[0][0];

        for (int i = 1; i < wordLengths.length; i++) {
            int len = Integer.parseInt(wordLengths[i][1]);
            if (len < minLength) {
                minLength = len;
                shortestWord = wordLengths[i][0];
            }
            if (len > maxLength) {
                maxLength = len;
                longestWord = wordLengths[i][0];
            }
        }

        System.out.println("\nShortest Word: " + shortestWord + " (Length: " + minLength + ")");
        System.out.println("Longest Word: " + longestWord + " (Length: " + maxLength + ")");

        return new int[]{minLength, maxLength};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String text = sc.nextLine();

        String[] words = splitIntoWords(text);
        String[][] wordLengths = getWordLengths(words);

        // Display words and their lengths
        System.out.println("\nWord\tLength");
        System.out.println("----------------");
        for (int i = 0; i < wordLengths.length; i++) {
            int len = Integer.parseInt(wordLengths[i][1]);
            System.out.println(wordLengths[i][0] + "\t" + len);
        }

        // Find shortest and longest words
        findShortestLongest(wordLengths);

        sc.close();
    }
}
