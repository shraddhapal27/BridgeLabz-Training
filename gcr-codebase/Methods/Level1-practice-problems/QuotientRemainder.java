import java.util.Scanner;
public class QuotientRemainder{

public static int[] findRemainderAndQuotient(int number, int divisor){
  int quotient = number / divisor;
  int remainder = number % divisor;
  
  int[] result = new int[2];
  result[0] = quotient;
  result[1] = remainder;
  
  return result;
}


  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	
	int number = sc.nextInt();
	int divisor = sc.nextInt();
	
	if(divisor == 0){
	  System.out.print("The division of zero is not allowed");
	}else{
	  int[] output = findRemainderAndQuotient(number,divisor);
	  
	  System.out.println("Quotient = " + output[0]);
      System.out.println("Remainder = " + output[1]);
	}
	
	sc.close();
  }
}