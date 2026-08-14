package ExtraArrLLTreeQue;

import java.util.ArrayList;
import java.util.List;

public class ReverseArray {
    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=a.size()-1; i>=0; i--){
            result.add(a.get(i));
        }
        return result;
    }
    public static void main(String[] args) {

    }

}


