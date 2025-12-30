import java.util.*;

public class TemperatureLogger{
 public static void main(String[] args){
 
   Scanner sc = new Scanner(System.in);
   
    double sum = 0; 
    double max = Double.MIN_VALUE;	
	System.out.println("Welcome to the Weekly Temperature Logger :");
	System.out.println("Enter temperature in degrees- ");
	System.out.println("------------------------------");
    double[] temperature = new double[7];
    for(int i=0; i<temperature.length; i++){
	System.out.println();
	System.out.println("Enter temperature for day" + (i+1) + " : ");
	   temperature[i] = sc.nextDouble();
	   sum += temperature[i];
	   
	   if(temperature[i] > max){
	     max = temperature[i];
	   }
	   
	 }	 
	 System.out.println("The average temperature for these seven days is : " + (sum / 7) + " \u00B0C");
	 System.out.println("The maximum temerature above them is : " + max + " \u00B0C");
	 
	 
 } 
}