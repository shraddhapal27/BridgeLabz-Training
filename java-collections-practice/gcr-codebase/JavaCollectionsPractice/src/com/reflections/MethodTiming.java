package com.reflections;

import java.lang.reflect.Method;

class PerformanceTest {
    public void fastMethod() {
        // Simulate work
        for (int i = 0; i < 1000; i++) {}
    }
    
    public void slowMethod() {
        // Simulate heavy work
        for (int i = 0; i < 100000; i++) {
            Math.sqrt(i);
        }
    }
}

public class MethodTiming {
    public static void timeMethods(Object target) {
        Method[] methods = target.getClass().getDeclaredMethods();
        
        for (Method method : methods) {
            if (method.getParameterCount() == 0) {
                try {
                    long totalTime = 0;
                    int runs = 100;
                    
                    method.setAccessible(true);
                    for (int i = 0; i < runs; i++) {
                        long start = System.nanoTime();
                        method.invoke(target);
                        totalTime += System.nanoTime() - start;
                    }
                    
                    double avgTime = totalTime / (double) runs / 1_000_000;
                    System.out.printf("%s: %.3f ms avg (over %d runs)%n", 
                                    method.getName(), avgTime, runs);
                } catch (Exception e) {
                    System.err.println("Error timing " + method.getName() + ": " + e.getMessage());
                }
            }
        }
    }
    
    public static void main(String[] args) {
        MethodTiming test = new MethodTiming();
        timeMethods(test);
    }
}
