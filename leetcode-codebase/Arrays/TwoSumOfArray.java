import java.util.Scanner;

public class TwoSumOfArray {

    // Method to find indices of two numbers
    public static int[] twoSum(int[] nums, int target) {

        // Check all pairs
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        // As per problem statement, this line will never execute
        return new int[] {};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input target
        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        // Call method
        int[] result = twoSum(nums, target);

        // Output result
        System.out.println("Output indices: [" + result[0] + ", " + result[1] + "]");

        sc.close();
    }
}
