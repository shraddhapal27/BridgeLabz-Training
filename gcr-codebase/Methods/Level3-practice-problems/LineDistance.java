import java.util.Scanner;

public class LineDistance {

    // Method to calculate Euclidean distance between two points
    public static double euclideanDistance(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }

    // Method to find the equation of a line passing through two points
    public static double[] lineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1); // slope
        double b = y1 - m * x1;           // y-intercept
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input points
        System.out.print("Enter coordinates of point 1 (x1 y1): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter coordinates of point 2 (x2 y2): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Calculate distance
        double distance = euclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean distance between points: " + distance);

        // Calculate line equation
        if (x1 == x2) {
            System.out.println("The line is vertical: x = " + x1);
        } else {
            double[] equation = lineEquation(x1, y1, x2, y2);
            System.out.printf("Equation of the line: y = %.2fx + %.2f\n", equation[0], equation[1]);
        }

        sc.close();
    }
}
