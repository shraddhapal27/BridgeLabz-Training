import java.util.Scanner;

public class ToggleCase {

    public static String toggleCase(String str) {
        char[] result = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                result[i] = (char)(ch + 32);
            } else if (ch >= 'a' && ch <= 'z') {
                result[i] = (char)(ch - 32);
            } else {
                result[i] = ch;
            }
        }
        return new String(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String text = sc.nextLine();

        System.out.println("Toggled String: " + toggleCase(text));
    }
}
