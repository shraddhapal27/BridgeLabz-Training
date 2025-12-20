import java.util.Scanner;
public class NumberPower{
  public static void main(String args[]){
  
   Scanner sc = new Scanner(System.in);
   
   int number = sc.nextInt();
   int power = sc.nextInt();
   int result = 1;
   
   if(number > 0 && power > 0){
      for(int i=1; i<power; i++){
	    result = result*i;
	  }
	  System.out.print(result);
    }
      }
	  else{
        System.out.print("Enter a positive integer");
    }
  }
}