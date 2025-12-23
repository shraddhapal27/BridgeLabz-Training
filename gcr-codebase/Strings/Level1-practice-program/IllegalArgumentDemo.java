import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method 1: Generate IllegalArgumentException
    public static void generateException(String text) {
        // start index > end index
        System.out.println(text.substring(4, 2));
    }

    // Method 2: Handle IllegalArgumentException
    public static void handleException(String text) {
        try {
            System.out.println(text.substring(4, 2));
        } 
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught!");
            System.out.println("Start index cannot be greater than end index");
        } 
        catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        
         generateException(text);

        // Handles Runtime Exception safely
         handleException(text);

        System.out.println("Program executed successfully");

        sc.close();
    }
}
