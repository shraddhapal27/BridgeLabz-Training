package com.reflections;

import java.lang.reflect.Method;

class Calculator {
    private int multiply(int a, int b) {
        return a * b;
    }
    
    private String secretMethod() {
        return "This is private!";
    }
}

public class PrivateMethodInvocation {
    public static void main(String[] args) throws Exception {
        Calculator calc = new Calculator();
        
        // Invoke private multiply method
        Method multiplyMethod = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
        multiplyMethod.setAccessible(true);
        int result = (int) multiplyMethod.invoke(calc, 7, 8);
        System.out.println("7 * 8 = " + result);
        
        // Invoke private secret method
        Method secretMethod = Calculator.class.getDeclaredMethod("secretMethod");
        secretMethod.setAccessible(true);
        String secret = (String) secretMethod.invoke(calc);
        System.out.println("Secret: " + secret);
    }
}
