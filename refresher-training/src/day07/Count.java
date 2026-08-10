package day07;

public class Count {
    public static void count(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        count(n-1);
    }

    public static void main(String[] args) {
        count(4);
    }
}
