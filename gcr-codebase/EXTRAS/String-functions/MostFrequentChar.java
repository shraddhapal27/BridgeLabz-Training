import java.util.Scanner;

public class MostFrequentChar {

    public static char mostFrequent(String str) {
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        char maxChar = str.charAt(0);
        int max = freq[maxChar];

        for (int i = 1; i < str.length(); i++) {
            if (freq[str.charAt(i)] > max) {
                max = freq[str.charAt(i)];
                maxChar = str.charAt(i);
            }
        }
        return maxChar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String text = sc.nextLine();

        System.out.println("Most Frequent Character: '" + mostFrequent(text) + "'");
    }
}
