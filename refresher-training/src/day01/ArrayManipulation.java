package day01;

//first learn the concept of difference array
//in difference array :-
//mmanlo ek array indexes hain - 1 2 3 4 5
//ab query hai 2 3 10 mtlb 2 se 3 index tk uski values m 10 add krdo
//toh for difference array hme jaha se add krna start krna toh vaha chor k ek aage se kro jaise yaha 1 se add krna toh hm 2 se krenge and jaha tk krna vaha uske ek jake minus krenge 10 like 6 p -10.
//fir prefix sum ka concept hai


import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // size of array
        int m = sc.nextInt(); // no of operations or query

        long[] arr = new long[n + 2];
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();


            // start adding frm index a
            arr[a] += k;

            // stop adding after index b
            arr[b+1] -= k;
        }
        long max =0;
        long sum=0;
        for(int i=0; i<=n; i++){
            sum += arr[i];

            if(sum > max){
                max = sum;
            }
        }
        System.out.println(max);
    }
}
