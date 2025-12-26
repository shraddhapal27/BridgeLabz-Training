import java.util.Scanner;

public class BmiCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input weight in kilograms
        System.out.print("Enter weight (in kg): ");
        double weightKg = sc.nextDouble();

        // Input height in meters
        System.out.print("Enter height (in meters): ");
        double heightMeters = sc.nextDouble();

        // BMI calculation
        double bmi = weightKg / (heightMeters * heightMeters);

        System.out.println("\nYour BMI is: " + bmi);

        // BMI category check
        if (bmi < 18.5) {
            System.out.println("BMI Category: Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("BMI Category: Normal");
        } else {
            System.out.println("BMI Category: Overweight");
        }

        sc.close();
    }
}
