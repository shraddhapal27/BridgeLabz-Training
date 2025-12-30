import java.util.Scanner;

public class ResultGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;
        int subjects = 5;

        // Input marks using for-loop
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = sc.nextInt();
            total += marks;
        }

        // Calculate average
        int average = total / subjects;

        System.out.println("Average Marks: " + average);

        // Assign grade using switch
        switch (average / 10) {

            case 10:
            case 9:
                System.out.println("Grade: A");
                break;

            case 8:
            case 7:
                System.out.println("Grade: B");
                break;

            case 6:
                System.out.println("Grade: C");
                break;

            case 5:
            case 4:
                System.out.println("Grade: D");
                break;

            default:
                System.out.println("Grade: F");
        }

        sc.close();
    }
}
