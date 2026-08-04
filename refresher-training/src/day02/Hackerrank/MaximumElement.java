package day02.Hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MaximumElement {
    public static void main(String[] args) {
String[] operations = new String[]{""};
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();
        List<Integer> ans = new ArrayList<>();

        for (String op : operations) {

            String[] parts = op.split(" ");

            if (parts[0].equals("1")) {

                int x = Integer.parseInt(parts[1]);

                stack.push(x);

                if (maxStack.isEmpty()) {
                    maxStack.push(x);
                } else {
                    maxStack.push(Math.max(x, maxStack.peek()));
                }

            } else if (parts[0].equals("2")) {

                stack.pop();
                maxStack.pop();

            } else if (parts[0].equals("3")) {

                ans.add(maxStack.peek());
            }
        }

        System.out.println(ans);
    }
    }

