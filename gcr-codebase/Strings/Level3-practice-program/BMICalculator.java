import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and status for a person
    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100; // Convert cm to meters
        double bmi = weight / (heightM * heightM);
        bmi = Math.round(bmi * 100.0) / 100.0; // Round to 2 decimal places

        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 24.9) {
            status = "Normal weight";
        } else if (bmi < 29.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[]{String.valueOf(weight), String.valueOf(heightCm), String.valueOf(bmi), status};
    }

    // Method to compute BMI and status for all persons
    public static String[][] computeBMIForAll(double[][] data) {
        int n = data.length;
        String[][] result = new String[n][4];

        for (int i = 0; i < n; i++) {
            result[i] = calculateBMI(data[i][0], data[i][1]);
        }

        return result;
    }

    // Method to display BMI table
    public static void displayBMI(String[][] bmiData) {
        System.out.println("Weight(kg)\tHeight(cm)\tBMI\tStatus");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < bmiData.length; i++) {
            System.out.println(
                    bmiData[i][0] + "\t\t" +
                    bmiData[i][1] + "\t\t" +
                    bmiData[i][2] + "\t" +
                    bmiData[i][3]
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10; // Number of members
        double[][] membersData = new double[n][2]; // Column 0 = weight, Column 1 = height

        // Take input for all members
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            membersData[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            membersData[i][1] = sc.nextDouble();
        }

        // Compute BMI and status for all members
        String[][] bmiResults = computeBMIForAll(membersData);

        // Display BMI table
        displayBMI(bmiResults);

        sc.close();
    }
}
