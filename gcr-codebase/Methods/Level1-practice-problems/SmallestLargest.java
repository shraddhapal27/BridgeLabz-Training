import java.util.Scanner;

public class SmallestLargest {

    // single method to find smallest and largest
    public static void findSmallestLargest(int a, int b, int c) {

        int smallest = a;
        int largest = a;

        if (b < smallest) {
            smallest = b;
        }
        if (c < smallest) {
            smallest = c;
        }

        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }

        System.out.println("Smallest number is: " + smallest);
        System.out.println("Largest number is: " + largest);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();

        int n2 = sc.nextInt();

        int n3 = sc.nextInt();

        findSmallestLargest(n1, n2, n3);

        sc.close();
    }
}
