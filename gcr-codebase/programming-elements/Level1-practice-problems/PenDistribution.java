import java.util.Scanner;
public class PenDistribution{
  public static void main(String args[]){
   
   Scanner sc = new Scanner(System.in);
   
   int pens = 14;
   int students = 3;
   
   
   int pensPerStudent = pens / students;
   int remainingPens = pens % students;
   
   System.out.print(
        "The Pen Per Student is " + pensPerStudent +
        " and the remaining pen is " + remainingPens		
 
 );
   }
}