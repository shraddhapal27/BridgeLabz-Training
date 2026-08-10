package day07;

public class TailRecursion {
    public static void tailRecursion(int n){
        if(n==0) return;

        // yaha pehle hm print krte hain fir recursive call hota hai
        System.out.println(n);
        tailRecursion(n-1);

    }
    public static void main(String[] args) {

    }
}
