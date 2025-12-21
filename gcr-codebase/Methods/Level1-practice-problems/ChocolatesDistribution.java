import java.util.Scanner;

public class ChocolatesDistribution {

    public static int[] findRemainderAndQuotient(int number, int divisor) {

        int[] result = new int[2];
        result[0] = number / divisor;   // chocolates per child
        result[1] = number % divisor;   // remaining chocolates

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int chocolates = sc.nextInt();

        int children = sc.nextInt();

        if (children == 0) {
            System.out.println("Children cannot be zero");
        } else {
            int[] output = findRemainderAndQuotient(chocolates, children);

            System.out.println("Each child gets: " + output[0]);
            System.out.println("Remaining chocolates: " + output[1]);
        }

        sc.close();
    }
}
