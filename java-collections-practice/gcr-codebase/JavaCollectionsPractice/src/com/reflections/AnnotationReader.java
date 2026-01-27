package com.reflections;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@interface Author {
    String name();
    String version() default "1.0";
}

@Author(name = "John Doe", version = "2.1")
class Document {
    @Author(name = "Jane Smith")
    public void process() {
        System.out.println("Processing document...");
    }
}

public class AnnotationReader {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Document.class;
        
        // Class annotation
        if (clazz.isAnnotationPresent(Author.class)) {
            Author author = clazz.getAnnotation(Author.class);
            System.out.println("Class Author: " + author.name() + " (v" + author.version() + ")");
        }
        
        // Method annotation
        Method method = clazz.getMethod("process");
        if (method.isAnnotationPresent(Author.class)) {
            Author methodAuthor = method.getAnnotation(Author.class);
            System.out.println("Method Author: " + methodAuthor.name());
        }
    }
}
