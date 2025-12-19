import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        double perimeter = sc.nextDouble();

        // Calculating side using formula - side = perimeter / 4
        double side = perimeter / 4;

        // printing the result
        System.out.println("The length of the side is " + side +  " whose perimeter is " + perimeter);
    }
}
