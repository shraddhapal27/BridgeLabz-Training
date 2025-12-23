import java.util.Scanner;

public class StringIndexExceptionDemo {

    // Method 1: Generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
        // Accessing index beyond string length
        System.out.println(text.charAt(text.length()));
    }

    // Method 2: Handle StringIndexOutOfBoundsException
    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught!");
            System.out.println("Invalid index accessed");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();   // user input

        
         generateException(text);
         handleException(text);

        System.out.println("Program executed successfully");

        sc.close();
    }
}
