import java.util.Scanner;
public class RemoveDuplicateChars {
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   
   System.out.print("Enter the string: ");
   String str = sc.next();
   
   String result = "";
     // 
	 String reversedString = "";
	 for(int i= 0; i<str.length(); i++){
	    char ch = str.charAt(i);
		
		// check if the character is already present
		if(!result.contains(String.valueOf(ch))){
		  result += ch;
		}
	 }
	 
	System.out.println("String after removing duplicates: " + result);
	sc.close();
   
 }
}