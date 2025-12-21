import java.util.Scanner;

public class Sum{

public static int sumOfNos(int n){
   
   int sumVar = 0;
   
  for(int i=1; i<=n; i++){
    sumVar += i;
  }
  return sumVar;
}
 
 
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   
   int number = sc.nextInt();
   
   System.out.print(sumOfNos(number));
   
 }
}