package day04.Hackerrank;

import java.util.List;

public class RunningTime {
    public static int runningTime(List<Integer> arr) {
        // Write your code here
        int count = 0;
        for(int i=1; i<arr.size(); i++){
            int key = arr.get(i);
            int j = i-1;
            while(j >= 0 && arr.get(j) > key){
                arr.set(j + 1, arr.get(j));
                j--;
                count++;
            }
            arr.set(j+1, key);
        }
        return count;
    }
}
