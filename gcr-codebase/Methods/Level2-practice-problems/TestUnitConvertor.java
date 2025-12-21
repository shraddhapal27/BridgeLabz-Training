public class UnitConvertor {

    // Convert Yards to Feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Convert Feet to Yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Convert Meters to Inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Convert Inches to Meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Convert Inches to Centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }
}
public class TestUnitConvertor {
    public static void main(String[] args) {

        System.out.println("5 yards to feet: " + UnitConvertor.convertYardsToFeet(5));
        System.out.println("12 feet to yards: " + UnitConvertor.convertFeetToYards(12));
        System.out.println("2 meters to inches: " + UnitConvertor.convertMetersToInches(2));
        System.out.println("50 inches to meters: " + UnitConvertor.convertInchesToMeters(50));
        System.out.println("20 inches to centimeters: " + UnitConvertor.convertInchesToCentimeters(20));
    }
}
