import java.util.Scanner;
public class SimpleInterest{
 
 
  // method to calculate simple interest 
 public static double calculation(double principal, double rate, double time){
   return (principal * rate * time) / 100;
 }

  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
	 
	 double principal = sc.nextDouble();
	 double rate = sc.nextDouble();
	 double time = sc.nextDouble();
	 
	 
	// method call 
	 double si = calculation(principal, rate, time);
	 
	 
	 System.out.print("The Simple Interest is " + si + " for Principal " + principal + " Rate of Interest " + rate + " and Time " + time);
	 
  
  sc.close();
  }
}