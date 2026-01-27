package com.reflections;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

// Fixed: Added @Target meta-annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)  // Specifies this annotation can only be used on fields
@interface Inject {}

class DatabaseService {
    public void connect() { 
        System.out.println("Connected to DB"); 
    }
}

class UserService {
    @Inject
    private DatabaseService dbService;
    
    public void saveUser() {
        dbService.connect();
        System.out.println("User saved");
    }
}

class DIContainer {
    private Map<Class<?>, Object> instances = new HashMap<>();
    
    @SuppressWarnings("unchecked")
    public <T> T getInstance(Class<T> clazz) {
        // Return cached instance if exists
        if (instances.containsKey(clazz)) {
            return (T) instances.get(clazz);
        }
        
        try {
            T instance = createInstance(clazz);
            injectDependencies(instance);
            instances.put(clazz, instance);  // Cache the instance
            return instance;
        } catch (Exception e) {
            throw new RuntimeException("Failed to create instance of " + clazz.getSimpleName(), e);
        }
    }
    
    private <T> T createInstance(Class<T> clazz) throws Exception {
        // Fixed: Use getDeclaredConstructor() instead of getConstructor()
        Constructor<T> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);  // Make constructor accessible
        return constructor.newInstance();
    }
    
    // Fixed: Added injectionInProgress flag to prevent recursive calls
    private ThreadLocal<Boolean> injectionInProgress = new ThreadLocal<>();
    
    private void injectDependencies(Object instance) throws Exception {
        // Prevent recursive injection during dependency creation
        if (Boolean.TRUE.equals(injectionInProgress.get())) {
            return;
        }
        
        try {
            injectionInProgress.set(true);
            Class<?> clazz = instance.getClass();
            
            // Field injection
            for (Field field : clazz.getDeclaredFields()) {
                if (field.isAnnotationPresent(Inject.class)) {
                    field.setAccessible(true);
                    Class<?> dependencyType = field.getType();
                    
                    // Create dependency instance safely
                    Object dependency = instances.get(dependencyType);
                    if (dependency == null) {
                        dependency = getInstance(dependencyType);
                    }
                    
                    field.set(instance, dependency);
                }
            }
        } finally {
            injectionInProgress.set(false);
        }
    }
}

public class DependencyInjectionDemo {
    public static void main(String[] args) {
        try {
            DIContainer container = new DIContainer();
            UserService userService = container.getInstance(UserService.class);
            userService.saveUser();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
