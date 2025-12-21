import java.util.Scanner;

public class CalendarProgram {

    // Method to check Leap Year
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            return true;
        return false;
    }

    // Method to get month name
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    // Method to get number of days in month
    public static int getDaysInMonth(int month, int year) {
        int[] days = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month - 1];
    }

    // Method to get first day of month (0=Sun, 1=Mon...)
    public static int getFirstDay(int month, int year) {

        int day = 1;
        int m = month;
        int y = year;

        if (m < 3) {
            m = m + 12;
            y = y - 1;
        }

        int k = y % 100;
        int j = y / 100;

        int h = (day + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;

        // Convert Zeller's output to Sunday=0
        return (h + 6) % 7;
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.println("\n     " + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDay(month, year);
        int daysInMonth = getDaysInMonth(month, year);

        // First loop for indentation
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Second loop to print dates
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);

            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }

        sc.close();
    }
}
