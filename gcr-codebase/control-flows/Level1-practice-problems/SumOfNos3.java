import java.util.Scanner;

public class SumOfNos3{
 public static void main(String args[]){
   
   Scanner sc = new Scanner(System.in);
   
   int number = sc.nextInt();
   
   if(number <= 0){
    System.out.print("Entered number is not a Natural Number");
    }else{
	  
	   int sumLoop = 0;
	   int i=1;
	   
	   while(i<=number){
	   sumLoop += i;
	   i++;
	   }
	   int sumFormula = number * (number + 1) / 2;
	   
	   if(sumLoop == sumFormula){
	   System.out.print("Both computations are correct and equal");
	   }else{
	   System.out.print("Results are not equal");
	   }
	}
	sc.close();
  }
}