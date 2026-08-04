package day02.Hackerrank;

import java.util.Stack;

public class BalancedParenthesis {

    public static String isBalanced(String s) {
        // Write your code here
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }else{
                if(stack.isEmpty())
                    return "NO";
                char top = stack.pop();
                if(ch == ')' && top != '(')
                    return "NO";
                if(ch==']' && top!='[')
                    return "NO";

                if(ch=='}' && top!='{')
                    return "NO";

            }
            if(stack.isEmpty())
                return "YES";
        }
        return "NO";
    }
public static void main(String[] args) {

          
    }
}
