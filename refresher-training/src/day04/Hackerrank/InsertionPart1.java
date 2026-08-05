package day04.Hackerrank;

import java.util.List;

public class InsertionPart1 {
    public static void insertion(int n, List<Integer> arr){
        int key = arr.get(n-1);
        int j = n-2;
        while(j >= 0 && arr.get(j) > key){
            arr.set(j+1, arr.get(j));
            for(int num : arr){
                System.out.print(num + " ");
            }
            System.out.println();
            j--;
        }
        arr.set(j+1, key);
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

