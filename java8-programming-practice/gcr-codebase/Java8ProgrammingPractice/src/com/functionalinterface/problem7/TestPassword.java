package com.functionalinterface.problem7;

public class TestPassword {
    public static void main(String[] args) {
        String pwd = "Insure@2026";
        if (SecurityUtils.isStrongPassword(pwd)) {
            System.out.println("Password is strong!");
        } else {
            System.out.println("Password is weak!");
        }
    }
}

