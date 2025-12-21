import java.util.Scanner;

public class StudentScoreCard {

    // Method to generate random 2-digit scores for all students
    public static int[][] generateScores(int numStudents) {
        int[][] scores = new int[numStudents][3]; // 3 subjects: Physics, Chemistry, Maths
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 10 + (int)(Math.random() * 91); // random 10 to 99
            }
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateTotalsAndPercentage(int[][] scores) {
        int numStudents = scores.length;
        double[][] result = new double[numStudents][3]; // total, average, percentage

        for (int i = 0; i < numStudents; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            double average = (double) total / 3;
            double percentage = ((double) total / 300) * 100;

            // Round to 2 decimal places
            result[i][0] = Math.round(total * 100.0) / 100.0;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }

    // Method to display the scorecard
    public static void displayScoreCard(int[][] scores, double[][] totals) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(scores[i][j] + "\t");
            }
            for (int k = 0; k < 3; k++) {
                System.out.print(totals[i][k] + "\t");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();

        int[][] scores = generateScores(numStudents);
        double[][] totals = calculateTotalsAndPercentage(scores);

        displayScoreCard(scores, totals);

        sc.close();
    }
}
