import java.util.Scanner;
public class FeeDiscount{
  public static void main(String args[]){
   
   Scanner sc = new Scanner(System.in);
   int studentFee = 125000;
   int discountPercent = 10;
   
   double discount = (fee * discountPercent) / 100.0;
   double finalFee = studentFee - discount;
  
   System.out.orintln(
        "The discount amount is INR " + discount +
		" and final discounted fee is INR " + finalFee
   );
  
  }
}