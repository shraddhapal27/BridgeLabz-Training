import java.util.Scanner;
public class MultiplicationTable2{
 public static void main(String args[]){
   
   Scanner sc = new Scanner(System.in);
   
   // get an input number
     int number = sc.nextInt();

     int[] arr = new int[10];
     
	 for(int i=6; i<=9; i++){
	   number[i] = number * i;
	 }
	 
	 // displaying the results
	 for(int i=6; i<=9; i++){
	   System.out.println(number + " * " + i + " = " + arr[i-1]);
	 }
     sc.close();
 }
}