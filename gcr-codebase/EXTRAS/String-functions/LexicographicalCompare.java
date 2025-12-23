import java.util.Scanner;

public class LexicographicalCompare {

    public static void compareStrings(String s1, String s2) {
        int minLen = Math.min(s1.length(), s2.length());

        for (int i = 0; i < minLen; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (s1.charAt(i) < s2.charAt(i))
                    System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\"");
                else
                    System.out.println("\"" + s1 + "\" comes after \"" + s2 + "\"");
                return;
            }
        }

        if (s1.length() == s2.length())
            System.out.println("Both strings are equal");
        else if (s1.length() < s2.length())
            System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\"");
        else
            System.out.println("\"" + s1 + "\" comes after \"" + s2 + "\"");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("String 1: ");
        String s1 = sc.nextLine();

        System.out.print("String 2: ");
        String s2 = sc.nextLine();

        compareStrings(s1, s2);
    }
}
