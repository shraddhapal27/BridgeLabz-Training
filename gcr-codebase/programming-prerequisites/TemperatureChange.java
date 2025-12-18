import java.util.*;
class TemperatureConversion{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
	  float temp1 =  sc.nextFloat();
	    float fahreheit = (temp1 *9/5) + 32;
	      System.out.println(fahreheit);
  }
}