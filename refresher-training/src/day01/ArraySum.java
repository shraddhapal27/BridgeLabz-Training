package day01;

public class ArraySum {
    public static void main(String[] args) {
        int[] integers = {1,2,3,4,10,11};
        int sum = 0;
        for(int i=0; i<integers.length; i++){
            sum += integers[i];
        }
        System.out.println(sum);
    }
}
