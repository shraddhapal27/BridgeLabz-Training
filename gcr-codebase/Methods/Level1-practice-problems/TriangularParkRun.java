import java.util.Scanner;

public class TriangularParkRun {

    // method to calculate number of rounds
	
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000; // 5 km in meters
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        double side1 = sc.nextDouble();

        double side2 = sc.nextDouble()

        double side3 = sc.nextDouble();

        double rounds = calculateRounds(side1, side2, side3);

        System.out.println("The athlete must complete " + rounds + " rounds to finish a 5 km run.");

        sc.close();
    }
}
