import java.util.Scanner;

public class NumberChecker6 {

    // Method to find sum of proper divisors
    public static int sumOfProperDivisors(int num) {
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    // Method to check Perfect Number
    public static boolean isPerfectNumber(int num) {
        return sumOfProperDivisors(num) == num;
    }

    // Method to check Abundant Number
    public static boolean isAbundantNumber(int num) {
        return sumOfProperDivisors(num) > num;
    }

    // Method to check Deficient Number
    public static boolean isDeficientNumber(int num) {
        return sumOfProperDivisors(num) < num;
    }

    // Method to find factorial of a digit
    public static int factorial(int digit) {
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact = fact * i;
        }
        return fact;
    }

    // Method to check Strong Number
    public static boolean isStrongNumber(int num) {
        int temp = num;
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + factorial(digit);
            temp = temp / 10;
        }

        return sum == num;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPerfectNumber(num))
            System.out.println(num + " is a Perfect Number");
        else
            System.out.println(num + " is NOT a Perfect Number");

        if (isAbundantNumber(num))
            System.out.println(num + " is an Abundant Number");
        else
            System.out.println(num + " is NOT an Abundant Number");

        if (isDeficientNumber(num))
            System.out.println(num + " is a Deficient Number");
        else
            System.out.println(num + " is NOT a Deficient Number");

        if (isStrongNumber(num))
            System.out.println(num + " is a Strong Number");
        else
            System.out.println(num + " is NOT a Strong Number");

        sc.close();
    }
}
