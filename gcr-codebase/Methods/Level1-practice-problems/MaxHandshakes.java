import java.util.Scanner;

public class MaxHandshakes{
 
 // calculation for maximum handshake
 public static int calculation(int n){
   return (n * (n - 1)) / 2;
 }

  public static void main(String[] args){
	  
    Scanner sc = new Scanner(System.in);
	
	int numberOfStudents = sc.nextInt();
	
	int handshakes = calculation(numberOfStudents);
	
	System.out.print("The maximum number of handshakes is : " + handshakes);
	
	sc.close();
  }
}