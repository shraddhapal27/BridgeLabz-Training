package com.reflections;

import java.lang.reflect.Field;
import java.util.Arrays;

public class JsonSerializer {
    public static String toJson(Object obj) {
        if (obj == null) return "null";
        
        Class<?> clazz = obj.getClass();
        StringBuilder json = new StringBuilder("{\n");
        
        Field[] fields = clazz.getDeclaredFields();
        Arrays.sort(fields, (f1, f2) -> f1.getName().compareTo(f2.getName()));
        
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            field.setAccessible(true);
            
            try {
                Object value = field.get(obj);
                String fieldValue = formatValue(value);
                
                json.append("  \"").append(field.getName()).append("\": ")
                    .append(fieldValue);
                
                if (i < fields.length - 1) json.append(",");
                json.append("\n");
                
            } catch (IllegalAccessException e) {
                json.append("  \"").append(field.getName()).append("\": null\n");
            }
        }
        json.append("}");
        return json.toString();
    }
    
    private static String formatValue(Object value) {
        if (value == null) return "null";
        if (value instanceof String) return "\"" + value + "\"";
        if (value instanceof Number || value instanceof Boolean) return value.toString();
        return "\"" + value.toString() + "\"";
    }
    
    static class Person {
        private String name = "John";
        private int age = 25;
        private boolean active = true;
    }
    
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(toJson(person));
    }
}
