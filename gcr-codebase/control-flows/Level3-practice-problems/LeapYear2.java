import java.util.Scanner;
public class PrimeNumber{
  public static void main(String args[]){
    
	Scanner sc = new Scanner(System.in);
	
	int number = sc.nextInt();
	boolean isPrime = false;
	
	if(number > 1){
	  for(int i = 2; i<= number; i++){
	   if(number % i != 0){
	    System.out.print("Is the given number a prime number " + isPrime);
	   }else{
	    System.out.print("Is the given number a prime number " + isPrime);
	   }
	  }
	}else{
	  System.out.print("Enter a positive number");
	}
	
  }
}