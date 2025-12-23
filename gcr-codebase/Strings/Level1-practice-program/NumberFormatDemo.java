import java.util.Scanner;

public class NumberFormatDemo {

    // Method 1: Generate NumberFormatException
    public static void generateException(String text) {
        // This will generate NumberFormatException
        int number = Integer.parseInt(text);
        System.out.println("Number is: " + number);
    }

    // Method 2: Handle NumberFormatException
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Number is: " + number);
        } 
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught!");
            System.out.println("Input string does not contain a valid number");
        } 
        catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value: ");
        String text = sc.next();   // input as String

        generateException(text);

        // Handle Runtime Exception safely
        handleException(text);

        System.out.println("Program executed successfully");

        sc.close();
    }
}
