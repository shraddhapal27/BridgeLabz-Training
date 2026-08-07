package day06.Hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MissingNumber {
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        // Write your code here
        HashMap<Integer, Integer> arrr = new HashMap<>();
        HashMap<Integer, Integer> brrr = new HashMap<>();

        for(int num : arr){
            arrr.put(num,arrr.getOrDefault(num,0)+1);
        }

        for(int num : brr){
            brrr.put(num,brrr.getOrDefault(num,0)+1);
        }

        ArrayList<Integer> result = new ArrayList<>();

        for(int num : brrr.keySet()){
            if(arrr.getOrDefault(num, 0) < brrr.get(num)){
                result.add(num);
            }

        }
        Collections.sort(result);
        return result;


    }
public static void main(String[] args) {

    }
}
