import java.util.Scanner;

public class RemoveCharacter {

    public static String removeChar(String str, char remove) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != remove) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String text = sc.nextLine();

        System.out.print("Character to remove: ");
        char ch = sc.next().charAt(0);

        System.out.println("Modified String: " + removeChar(text, ch));
    }
}
