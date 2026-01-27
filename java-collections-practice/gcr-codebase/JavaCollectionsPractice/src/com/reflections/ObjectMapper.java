package com.reflections;

import java.lang.reflect.Field;
import java.util.Map;

public class ObjectMapper {
    @SuppressWarnings("unchecked")
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        try {
            T instance = clazz.getDeclaredConstructor().newInstance();
            
            for (Field field : clazz.getDeclaredFields()) {
                field.setAccessible(true);
                String fieldName = field.getName();
                
                if (properties.containsKey(fieldName)) {
                    Object value = properties.get(fieldName);
                    field.set(instance, value);
                }
            }
            return instance;
        } catch (Exception e) {
            throw new RuntimeException("Failed to map properties to " + clazz.getSimpleName(), e);
        }
    }
    
    // Test classes
    static class User {
        private String name;
        private int age;
        private String email;
        
        @Override public String toString() { 
            return String.format("User{name='%s', age=%d, email='%s'}", name, age, email); 
        }
    }
    
    public static void main(String[] args) {
        Map<String, Object> data = Map.of(
            "name", "Alice",
            "age", 30,
            "email", "alice@example.com"
        );
        
        User user = toObject(User.class, data);
        System.out.println(user);
    }
}

