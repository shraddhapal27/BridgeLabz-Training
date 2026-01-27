package com.annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;

// Custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod {
    String level() default "HIGH";
}

class BusinessLogic {
    @ImportantMethod(level = "CRITICAL")
    public void processPayment() {
        System.out.println("Processing payment...");
    }
    
    @ImportantMethod
    public void validateUser() {
        System.out.println("Validating user...");
    }
    
    public void regularMethod() {
        System.out.println("Regular operation");
    }
}

class ImportantMethodDemo {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = BusinessLogic.class;
        Method[] methods = clazz.getDeclaredMethods();
        
        System.out.println("=== IMPORTANT METHODS ===");
        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println(method.getName() + " - Priority: " + annotation.level());
            }
        }
    }
}
