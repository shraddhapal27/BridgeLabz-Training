package day04;

public class BubbleSort {
    public  static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            boolean swapped = false;

            for(int j=0; i<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

    public static void main(String[] args) {

    }
}
