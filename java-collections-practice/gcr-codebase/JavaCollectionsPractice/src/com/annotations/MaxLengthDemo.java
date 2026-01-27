package com.annotations;

import java.lang.annotation.*;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value();
}

class User {
    @MaxLength(10)
    private String username;
    
    public User(String username) {
        validateMaxLength(username);
        this.username = username;
    }
    
    private void validateMaxLength(String value) {
        try {
            Field usernameField = User.class.getDeclaredField("username");
            if (usernameField.isAnnotationPresent(MaxLength.class)) {
                MaxLength maxLength = usernameField.getAnnotation(MaxLength.class);
                if (value != null && value.length() > maxLength.value()) {
                    throw new IllegalArgumentException(
                        String.format("Username exceeds max length of %d: %s", 
                                    maxLength.value(), value));
                }
            }
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
    
    @Override
    public String toString() {
        return "User{username='" + username + "'}";
    }
}

public class MaxLengthDemo {
    public static void main(String[] args) {
        try {
            User user1 = new User("johndoe123");  // Valid
            System.out.println(user1);
            
            User user2 = new User("verylongusername123456");  // Invalid
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
