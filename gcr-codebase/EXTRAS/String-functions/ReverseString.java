import java.util.Scanner;
public class ReverseString{
  public static void main(String[] args){
   
     Scanner sc = new Scanner(System.in);
	 
	 System.out.print("Enter the string: ");
	 String str = sc.next();
	 
	 char[] ch =  str.toCharArray();
	 String reversedString = " ";
	 for(int i= ch.length-1; i>=0; i--){
	   reversedString += ch[i]; 
	 }
	 
	 System.out.println("The original string is : " + str);
	 System.out.println("The reversed string is : " + reversedString);
	 
	 
   }
}