package day06;

public class BinaryLastOccurence {
    public static int lastOccurence(int[] arr,int key){
        int low = 0, high = arr.length-1, result = -1;
        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] == key){
                result = mid;
                low = mid +1;;
            }
            else if(arr[mid] < key){
                low = mid +1;;
            }
            else{
                high = mid -1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {4, 4, 4, 8, 9};
        int first = lastOccurence(arr,4);
        System.out.println("First occurrence: " + first);
    }
}
