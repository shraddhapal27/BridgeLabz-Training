import java.util.Scanner;
public class NumberMultiples{
  public static void main(String args[]){
    
	Scanner sc = new Scanner(System.in);
	
	int number = sc.nextInt();
	if(number > 0 && number < 100){
	   for(int i=number; i>=0; i--){
	     if(i % number == 0){
		 System.out.print(number);
		 }
	   }
	}
     sc.close();
  }
}