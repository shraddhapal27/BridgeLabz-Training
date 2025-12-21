import java.util.Scanner;

public class CollinearPoints {

    // Method to check collinearity using slope formula
    public static boolean isCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // To avoid division by zero, we use cross multiplication
        // slopeAB = (y2 - y1)/(x2 - x1)
        // slopeAC = (y3 - y1)/(x3 - x1)
        // slopeBC = (y3 - y2)/(x3 - x2)
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }

    // Method to check collinearity using area of triangle
    public static boolean isCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates of point A (x1 y1): ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter coordinates of point B (x2 y2): ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.println("Enter coordinates of point C (x3 y3): ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        // Using slope method
        if (isCollinearSlope(x1, y1, x2, y2, x3, y3))
            System.out.println("Points are collinear (Slope method)");
        else
            System.out.println("Points are NOT collinear (Slope method)");

        // Using area method
        if (isCollinearArea(x1, y1, x2, y2, x3, y3))
            System.out.println("Points are collinear (Area method)");
        else
            System.out.println("Points are NOT collinear (Area method)");

        sc.close();
    }
}
