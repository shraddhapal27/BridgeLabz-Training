import java.util.Scannerimport java.util.Scanner;

public class NumberChecker {

    // Method to find count of digits
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Method to store digits in array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int index = count - 1;

        while (number != 0) {
            digits[index] = number % 10;
            number /= 10;
            index--;
        }
        return digits;
    }

    // Method to check Duck Number
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check Armstrong Number
    public static boolean isArmstrongNumber(int originalNumber, int[] digits) {
        int power = digits.length;
        int sum = 0;

        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(digits[i], power);
        }
        return sum == originalNumber;
    }

    // Method to find largest and second largest
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find smallest and second smallest
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < smallest) {
                secondSmallest = smallest;
                smallest = digits[i];
            } else if (digits[i] < secondSmallest && digits[i] != smallest) {
                secondSmallest = digits[i];
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        int number = sc.nextInt();

        int[] digits = storeDigits(number);

        System.out.print("Digits: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();

        System.out.println("Count of Digits: " + countDigits(number));
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(number, digits));

        int[] large = findLargestAndSecondLargest(digits);
        System.out.println("Largest: " + large[0]);
        System.out.println("Second Largest: " + large[1]);

        int[] small = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + small[0]);
        System.out.println("Second Smallest: " + small[1]);

        sc.close();
    }
}
