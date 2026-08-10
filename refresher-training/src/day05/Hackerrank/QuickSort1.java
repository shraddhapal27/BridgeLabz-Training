package day05.Hackerrank;

import java.util.ArrayList;
import java.util.List;

public class QuickSort1 {
    public static List<Integer> quickSort(List<Integer> arr) {

        int pivot = arr.get(0);

        List<Integer> left = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {

            if (arr.get(i) < pivot) {
                left.add(arr.get(i));
            }
            else if (arr.get(i) == pivot) {
                equal.add(arr.get(i));
            }
            else {
                right.add(arr.get(i));
            }
        }

        left.addAll(equal);
        left.addAll(right);

        return left;
    }
    public static void main(String[] args) {

    }
}
