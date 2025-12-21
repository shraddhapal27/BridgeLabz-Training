import java.util.Scanner;

public class LeapYear {

    // Method to check leap year
    public static boolean isLeapYear(int year) {

        // Condition: Gregorian calendar starts from 1582
        if (year < 1582) {
            return false;
        }

        // Leap year conditions
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
 
        int year = sc.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is NOT a Leap Year");
        }

        sc.close();
    }
}
