import java.util.Scanner;
public class ProfitLoss{
  public static void main(String args[]){
   
   Scanner sc = new Scanner(System.in);
   
   int sellingPrice = 191;
   int costPrice = 129;
    
   // calculate the profit and profit percentage
   int profit = sellingPrice - costPrice;
   int profitPercent = profit / costPrice * 100;
   
   //   Display the results
   System.out.println("The Cost Price is INR " + costPrice + " and the sellingPrice is INR " + sellingPrice);
   System.out.print("The Profit is INR " + profit + " and the profitPercent is " + profitPercent);
   
   sc.close();
  }
}