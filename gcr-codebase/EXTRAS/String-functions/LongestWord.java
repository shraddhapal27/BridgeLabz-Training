import java.util.Scanner;
public class LongestWord{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   
   System.out.print("Enter the sentence: ");
   String sentence = sc.nextLine();
   
   String[] words = sentence.split(" ");
   String longestWord = words[0];
   
   for(int i=1; i<words.length; i++){
     if(words[i].length() > longestWord.length()){
	  longestWord = words[i];
	 }
   }
   System.out.println("Longest word: " + longestWord);
   
   sc.close();
 }
}