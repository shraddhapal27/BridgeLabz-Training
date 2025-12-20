import java.util.Scanner;
public class SwitchCase{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
	
	double first = sc.nextDouble();
	double second = sc.nextDouble();
	String operation = sc.next();
	
	switch(operation){
	  case "+" :
	      System.out.print("result = " + (first + second));
	      break;
	  
	  case "-":
          System.out.println("Result = " + (first - second));
          break;

      case "*":
          System.out.println("Result = " + (first * second));
          break;
	  case "/":
	    if(second != 0){
		  System.out.print("Result = " + (first / second));
		}
		else{
	       System.out.println("Cannot divide by zero");
    	}
		   break;

      default:
           System.out.println("Invalid Operator");
	}
	
	sc.close();
  }
}