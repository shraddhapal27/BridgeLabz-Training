package com.annotations;

import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();
}

// ✅ FIXED: Renamed from User to JsonUser (no conflict)
class JsonUser {
    @JsonField(name = "user_name")
    private String username;
    
    @JsonField(name = "user_email")
    private String email;
    
    private int age;
    
    public JsonUser(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }
}

class JsonSerializer {
    public static String toJson(Object obj) {
        if (obj == null) return "null";
        
        StringBuilder json = new StringBuilder("{\n");
        Field[] fields = obj.getClass().getDeclaredFields();
        List<Field> annotatedFields = new ArrayList<>();
        
        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonField.class)) {
                annotatedFields.add(field);
            }
        }
        
        annotatedFields.sort((f1, f2) -> f1.getName().compareTo(f2.getName()));
        
        for (int i = 0; i < annotatedFields.size(); i++) {
            Field field = annotatedFields.get(i);
            field.setAccessible(true);
            
            try {
                JsonField jsonField = field.getAnnotation(JsonField.class);
                Object value = field.get(obj);
                String jsonValue = formatValue(value);
                
                json.append("  \"").append(jsonField.name()).append("\": ").append(jsonValue);
                if (i < annotatedFields.size() - 1) {
                    json.append(",");
                }
                json.append("\n");
                
            } catch (IllegalAccessException e) {
                System.err.println("Cannot access: " + field.getName());
            }
        }
        json.append("}");
        return json.toString();
    }
    
    private static String formatValue(Object value) {
        if (value == null) return "null";
        if (value instanceof String) return "\"" + value.toString() + "\"";
        return value.toString();
    }
}

// ✅ FIXED: Renamed public class to avoid conflicts
public class JsonFieldDemoFixed {
    public static void main(String[] args) {
        JsonUser user = new JsonUser("john_doe", "john@example.com", 30);
        System.out.println(JsonSerializer.toJson(user));
    }
}
