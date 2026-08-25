package day18.hackerrank;

public class ValidUsername {
    public static void main(String[] args) {
         String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}";
       if("Ram".matches(regularExpression)){
           System.out.println("Valid");
       }else{
           System.out.println("Invalid");
       }
    }
}
