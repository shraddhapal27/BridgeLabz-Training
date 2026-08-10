package day07;


// tail recursion me logic ke baad koi kaam bacha hi nhi hota.
// A recursive function is generally called tail recursive when the recursive call is the last operation performed by the function.

// calling and recursive phase
public class HeadRecursion {
    public static void headRecursion(int n){
        if(n==0) return;

        // yaha p pehle function call hota h fir print
        headRecursion(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {

    }
}
