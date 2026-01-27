package com.reflections;

import java.lang.reflect.Method;
import java.util.Scanner;

class MathOperations {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
    public double divide(double a, double b) { return a / b; }
}

public class DynamicMethodCall {
    public static void main(String[] args) throws Exception {
        MathOperations math = new MathOperations();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter method name (add/subtract/multiply/divide): ");
        String methodName = scanner.nextLine();
        
        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        Method method = MathOperations.class.getMethod(methodName, int.class, int.class);
        Object result = method.invoke(math, a, b);
        System.out.println(methodName + "(" + a + ", " + b + ") = " + result);
        
        scanner.close();
    }
}
