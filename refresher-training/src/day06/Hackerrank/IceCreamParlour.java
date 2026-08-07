package day06.Hackerrank;

import java.util.ArrayList;
import java.util.List;

public class IceCreamParlour {
    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        // Write your code here
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<arr.size(); i++){
            for(int j=i+1; j<arr.size(); j++){
                if(arr.get(i) + arr.get(j) == m){
                    result.add(i+1);
                    result.add(j+1);

                }
            }

        }
        return result;
    }
    public static void main(String[] args) {

    }
}
