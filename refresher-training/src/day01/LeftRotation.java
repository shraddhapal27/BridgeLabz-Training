package day01;


// steps to do this left rotation is basically reverse method :-

// first take input arr
// reverse the given arr
// then first reverse the elements of k position
// then reverse the remaining elements

// =============================================================


public class LeftRotation {

    public static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateRight(int[] arr, int k){
        int n = arr.length;
         k = k % n;
         reverse(arr, 0, n-1);
         reverse(arr, 0, k-1);
         reverse(arr, k, n-1);

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k = 3;
        rotateRight(arr,2);
        for(int a : arr){
            System.out.print(a + " ");
        }
    }
}
