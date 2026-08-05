package day04;

public class SelectionSort {
    public static void selectionSort(int [] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int minIndex = i;
            for(int j = 1+1; j<n; j++){
                if(arr[j] < arr[minIndex] ){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
    public static void main(String[] args) {
     int[] arr = {13, 10, 29, 1, 3};
     selectionSort(arr);

   for(int val : arr){
       System.out.println(val + " ");
   }
   selectionSort(arr);
    }
    
}
