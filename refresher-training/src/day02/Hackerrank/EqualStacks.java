package day02.Hackerrank;

import java.util.Stack;

public class EqualStacks {


    public static void main(String[] args) {
        int[] a1 = {1,2,7};
        int[] a2 = {5,3,5,7};
        int[] a3 = {1,4};

        int s1 = 0, s2=0, s3=0;

        Stack<Integer> stack = new Stack<>();

        for(int a : a1){
            s1 += a;
        }
        for(int b : a2){
            s2 += b;
        }
        for(int c : a3){
            s3 += c;
        }

        int i=0, j=0, k=0;

       while(true){
           if(s1 == s2 && s1 == s3){
               System.out.println("Equal");
           }
           if(s1 >= s2 && s1 >= s3){
               s1 -= a1[0];
               i++;
           }
           else if(s2 >= s1 && s2 >= s3){
               s2 -= a2[0];
               j++;
           }
           else  {
               s3 -= a3[0];
               k++;
           }
       }
        }
    }