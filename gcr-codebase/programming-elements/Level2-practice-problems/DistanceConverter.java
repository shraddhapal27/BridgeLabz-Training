import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double distanceInFeet = sc.nextDouble();

        // Convert feet to yards
        double distanceInYards = distanceInFeet / 3;

        // Convert yards to miles
        double distanceInMiles = distanceInYards / 1760;

        System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles);
    }
}
