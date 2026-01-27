package com.reflections;

import java.lang.reflect.*;
import java.util.Scanner;

public class ClassInspector {
    public static void main(String[] args) throws ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter class name: ");
        String className = scanner.nextLine();
        
        Class<?> clazz = Class.forName(className);
        
        System.out.println("=== CLASS: " + clazz.getSimpleName() + " ===");
        
        // Fields
        System.out.println("\nFIELDS:");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            int mods = field.getModifiers();
            System.out.println("  " + Modifier.toString(mods) + " " + 
                             field.getType().getSimpleName() + " " + field.getName());
        }
        
        // Methods
        System.out.println("\nMETHODS:");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("  " + method.toGenericString());
        }
        
        // Constructors
        System.out.println("\nCONSTRUCTORS:");
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("  " + constructor.toGenericString());
        }
    }
}
