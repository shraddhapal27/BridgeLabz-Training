import java.util.Scanner;

public class StringLengthWithoutMethod {

    // Method 1: Find string length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) { // infinite loop
                text.charAt(count); // try to access char
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // reached end of string
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.next();

        // User-defined method
        int userLength = findLength(str);

        // Built-in method
        int builtInLength = str.length();

        // Display results
        System.out.println("Length using user-defined method: " + userLength);
        System.out.println("Length using built-in method: " + builtInLength);

        sc.close();
    }
}
