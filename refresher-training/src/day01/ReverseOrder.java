package day01;

public class ReverseOrder {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2};
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
