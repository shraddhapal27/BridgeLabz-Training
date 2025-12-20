import java.util.Scanner;
class NumberCounter{
 public static void main(String args[]){
 
Scanner sc = new Scanner(System.in);
  int counter = sc.nextInt();
  while(counter >= 1){
	 System.out.println(counter);
     counter--;
	 }
	 System.out.print("Launch !");
	sc.close(); 
   }
}