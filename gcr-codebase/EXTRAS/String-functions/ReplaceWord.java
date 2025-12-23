import java.util.Scanner;

public class ReplaceWord {

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String result = "";
        int i = 0;

        while (i < sentence.length()) {
            int j = 0;

            while (j < oldWord.length() &&
                   i + j < sentence.length() &&
                   sentence.charAt(i + j) == oldWord.charAt(j)) {
                j++;
            }

            if (j == oldWord.length()) {
                result += newWord;
                i += oldWord.length();
            } else {
                result += sentence.charAt(i);
                i++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Word to replace: ");
        String oldWord = sc.nextLine();

        System.out.print("New word: ");
        String newWord = sc.nextLine();

        System.out.println("Modified Sentence: " +
                replaceWord(sentence, oldWord, newWord));
    }
}
