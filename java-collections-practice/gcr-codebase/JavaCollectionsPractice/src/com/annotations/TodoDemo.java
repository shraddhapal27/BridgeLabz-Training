package com.annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

class TaskManager {
    @Todo(task = "Implement user authentication", assignedTo = "Alice", priority = "HIGH")
    public void authenticateUser() {
        System.out.println("User authentication");
    }
    
    @Todo(task = "Add database backup", assignedTo = "Bob")
    public void backupDatabase() {
        System.out.println("Database backup");
    }
    
    @Todo(task = "Fix login UI bug", assignedTo = "Charlie", priority = "LOW")
    public void fixLoginUI() {
        System.out.println("Fix login UI");
    }
}

class TodoDemo {
    public static void printTodos(Class<?> clazz) {
        List<String> todos = new ArrayList<>();
        Method[] methods = clazz.getDeclaredMethods();
        
        for (Method method : methods) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo todo = method.getAnnotation(Todo.class);
                todos.add(String.format("Task: %s | Assigned: %s | Priority: %s",
                    todo.task(), todo.assignedTo(), todo.priority()));
            }
        }
        
        System.out.println("=== PENDING TASKS ===");
        todos.forEach(System.out::println);
    }
    
    public static void main(String[] args) throws Exception {
        printTodos(TaskManager.class);
    }
}
