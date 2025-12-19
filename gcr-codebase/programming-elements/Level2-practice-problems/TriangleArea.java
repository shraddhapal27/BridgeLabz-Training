import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking base and height input in centimeters
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        // Formula to calculate area in square centimeters
        double areaSqCm = 0.5 * base * height;

        // 1 inch = 2.54 cm
        // So, 1 sq inch = 2.54 * 2.54 sq cm
        double areaSqIn = areaSqCm / (2.54 * 2.54);

        // Printing the results
        System.out.println("The Area of the triangle in sq cm is " + areaSqCm);
        System.out.println("The Area of the triangle in sq in is " + areaSqIn);

    }
}
