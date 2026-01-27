package com.CSV.question8;

public class ValidateCsvData {
    public static void main(String[] args) {

        String email = "abc@gmail.com";
        String phone = "9876543210";

        String emailRegex = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        String phoneRegex = "\\d{10}";

        if (!email.matches(emailRegex))
            System.out.println("Invalid Email");

        if (!phone.matches(phoneRegex))
            System.out.println("Invalid Phone");
    }
}
