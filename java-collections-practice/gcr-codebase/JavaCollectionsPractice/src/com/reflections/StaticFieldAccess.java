package com.reflections;

import java.lang.reflect.Field;

class Configuration {
    private static String API_KEY = "default-key-123";
    private static int MAX_CONNECTIONS = 100;
    
    public static String getApiKey() {
        return API_KEY;
    }
}

public class StaticFieldAccess {
    public static void main(String[] args) throws Exception {
        System.out.println("Original API_KEY: " + Configuration.getApiKey());
        
        Field apiKeyField = Configuration.class.getDeclaredField("API_KEY");
        apiKeyField.setAccessible(true);
        
        // Modify static field (pass null for static fields)
        apiKeyField.set(null, "new-secret-key-456");
        System.out.println("Modified API_KEY: " + Configuration.getApiKey());
        
        // Reset
        apiKeyField.set(null, "default-key-123");
    }
}
