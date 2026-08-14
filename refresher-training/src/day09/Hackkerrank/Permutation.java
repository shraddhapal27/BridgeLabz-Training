package day09.Hackkerrank;

import java.util.Collections;
import java.util.List;

public class Permutation {
    public static boolean next_permutation(List<String> s) {

        int n = s.size();

        // Step 1: Find pivot
        int i = n - 2;

        while (i >= 0 && s.get(i).compareTo(s.get(i + 1)) >= 0) {
            i--;
        }

        // No next permutation
        if (i < 0) {
            return false;
        }

        // Step 2: Find the element just greater than pivot
        int j = n - 1;

        while (s.get(j).compareTo(s.get(i)) <= 0) {
            j--;
        }

        // Step 3: Swap pivot and successor
        Collections.swap(s, i, j);

        // Step 4: Reverse the suffix
        int left = i + 1;
        int right = n - 1;

        while (left < right) {
            Collections.swap(s, left, right);
            left++;
            right--;
        }

        return true;
    }
}
