import java.util.Scanner;
public class NumberMultiples2{
  public static void main(String args[]){
  
   Scanner sc = new Scanner(System.in);
   int number = sc.nextInt();
   
   if(number <= 0 || number > =100){}
      System.out.print("please enter a positive number less than 100");
   }else{
     int counter = number;
	 while(counter < 100){
	    System.out.print(counter);
		counter += number;
	  }
	  
	  sc.close();
   }
}