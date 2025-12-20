import java.util.Scanner;
public class SumOfNos2{
  public static void main(System.in){
	
	Scanner sc = new Scanner(System.in);
	
	double total = 0.0;
	double number;
	
	while(true){
	
	number = sc.nextDouble;
	
	if(number <= 0){
	   break;
	  }
	  total = total + number;
	}
	System.out.print("The total sum is: " + total);
	sc.close();
  }
}