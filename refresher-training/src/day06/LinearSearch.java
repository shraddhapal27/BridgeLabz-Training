package day06;

public class LinearSearch {
    public static int linearSearch(int[] arr, int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,8,9};
       int result =  linearSearch(arr,8);
        if(result == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index " + result);
        }
    }
}
