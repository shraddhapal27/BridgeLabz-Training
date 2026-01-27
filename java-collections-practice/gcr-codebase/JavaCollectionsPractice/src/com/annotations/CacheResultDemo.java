package com.annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {}

class ExpensiveCalculator {
    private Map<String, Integer> cache = new HashMap<>();
    
    @CacheResult
    public int fibonacci(int n) {
        System.out.println("Computing fibonacci(" + n + ") - expensive operation");
        
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);  // Recursive (expensive)
    }
    
    @CacheResult
    public String expensiveHash(String input) {
        System.out.println("Computing hash for: " + input);
        return String.valueOf(input.hashCode() * 31);
    }
    
    public int simpleMethod(int x) {
        return x * 2;  // Not cached
    }
}

class CacheAspect {
    private static Map<MethodKey, Object> methodCache = new HashMap<>();
    
    static class MethodKey {
        String methodName;
        Object[] args;
        
        MethodKey(String methodName, Object[] args) {
            this.methodName = methodName;
            this.args = args;
        }
        
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MethodKey methodKey = (MethodKey) o;
            return methodName.equals(methodKey.methodName) && 
                   Arrays.equals(args, methodKey.args);
        }
        
        @Override
        public int hashCode() {
            int result = methodName.hashCode();
            result = 31 * result + Arrays.hashCode(args);
            return result;
        }
    }
    
    public static Object invokeWithCache(Object target, String methodName, Object... args) 
            throws Exception {
        MethodKey key = new MethodKey(methodName, args);
        
        if (methodCache.containsKey(key)) {
            System.out.println("CACHE HIT for " + methodName + "(" + 
                Arrays.toString(args) + ")");
            return methodCache.get(key);
        }
        
        Method method = target.getClass().getMethod(methodName, 
            Arrays.stream(args).map(Object::getClass).toArray(Class[]::new));
        
        Object result = method.invoke(target, args);
        methodCache.put(key, result);
        
        System.out.println("CACHE MISS - stored result");
        return result;
    }
}

class CacheResultDemo {
    public static void main(String[] args) throws Exception {
        ExpensiveCalculator calc = new ExpensiveCalculator();
        
        // First call - computes and caches
        System.out.println("Fibonacci(5): " + CacheAspect.invokeWithCache(calc, "fibonacci", 5));
        // Second call - cache hit
        System.out.println("Fibonacci(5): " + CacheAspect.invokeWithCache(calc, "fibonacci", 5));
        
        System.out.println("\nHash: " + CacheAspect.invokeWithCache(calc, "expensiveHash", "test"));
        System.out.println("Hash: " + CacheAspect.invokeWithCache(calc, "expensiveHash", "test"));
    }
}
