package day01;

import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size");
        int n = sc.nextInt();

        int[] integers = new int[n];
        for(int i=0; i<integers.length; i++){
            integers[i] = sc.nextInt();
        }
        int positivecount = 0;
        int negativecount = 0;
        int zerocount = 0;

        for(int i=0; i<integers.length; i++){
            if(integers[i] > 0){
                positivecount++;
            } else if (integers[i] < 0) {
                negativecount++;
            }
            else{
                zerocount++;
            }
        }
        int total_int = integers.length;
        double positiveFraction = (double)positivecount / total_int;
        double negativeFraction = (double)negativecount / total_int;
        double zeroFraction = (double) zerocount / total_int;

        System.out.printf("%.6f%n",positiveFraction);
        System.out.printf("%.6f%n",negativeFraction);
        System.out.printf("%.6f%n",zeroFraction);

    }
}
