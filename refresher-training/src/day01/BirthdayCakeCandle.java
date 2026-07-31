package day01;

import java.util.Scanner;

public class BirthdayCakeCandle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] height = {3,2,1,3};
        int max = height[0];
        int count = 0;
        for(int i=0; i<height.length; i++){
            if(height[i] > max){
                max = height[i];
            }
        }

        for(int i=0; i<height.length; i++){
            if(height[i] ==  max){
                count++;
            }
        }
        System.out.println(count);
    }
}
