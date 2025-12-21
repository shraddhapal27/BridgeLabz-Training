import java.util.Scanner;

public class NumberCheck {

    // Check positive or negative
    public static boolean isPositive(int n) {
        return n >= 0;
    }

    // Check even or odd
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Compare two numbers
    public static int compare(int n1, int n2) {
        if (n1 > n2) return 1;
        else if (n1 == n2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int n : numbers) {
            if (isPositive(n)) {
                if (isEven(n)) System.out.println(n + " is positive and even");
                else System.out.println(n + " is positive and odd");
            } else {
                System.out.println(n + " is negative");
            }
        }

        int result = compare(numbers[0], numbers[4]);
        if (result == 1) System.out.println("First element is greater than last element");
        else if (result == 0) System.out.println("First element is equal to last element");
        else System.out.println("First element is less than last element");

        sc.close();
    }
}
