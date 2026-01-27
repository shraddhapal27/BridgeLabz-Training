package com.annotations;

 import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.util.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {}

class PerformanceTester {
    @LogExecutionTime
    public void fastOperation() {
        // Simulate fast operation
        for (int i = 0; i < 1000; i++) {}
    }
    
    @LogExecutionTime
    public void slowOperation() {
        // Simulate slow operation
        for (int i = 0; i < 100000; i++) {
            Math.sqrt(i);
        }
    }
}

public class ExecutionTimeAspect {
    public static void invokeWithTiming(Object target, String methodName, Object... args) throws Exception {
        Method method = target.getClass().getMethod(methodName, 
            Arrays.stream(args).map(Object::getClass).toArray(Class[]::new));
        
        long start = System.nanoTime();
        Object result = method.invoke(target, args);
        long end = System.nanoTime();
        
        System.out.printf("%s took %.3f ms%n", methodName, (end - start) / 1_000_000.0);
        return;
    }
}

class LogExecutionTimeDemo {
    public static void main(String[] args) throws Exception {
        PerformanceTester tester = new PerformanceTester();
        
        ExecutionTimeAspect.invokeWithTiming(tester, "fastOperation");
        ExecutionTimeAspect.invokeWithTiming(tester, "slowOperation");
    }
}
