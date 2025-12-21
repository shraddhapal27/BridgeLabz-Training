import java.util.Scanner;
public class SpringSeason{

public static boolean isSpringSeason(int month, int day){
  
  if((month ==3 && day >=20)|| 
     (month ==4 ) || 
	 (month == 5) ||
	 (month == 6 && day <= 20)){
	 
	 return true;
	 }
	 return false;

}

 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int month = Integer.parseInt(args[0]);
   int day = Integer.parseInt(args[1]);
   
   boolean result = isSpringSeason(month, day);
   
   if(result){
     System.out.print("Its a Spring Season");
   }else{
     System.out.print("Not a Spring Season);
   }
   
 }
}