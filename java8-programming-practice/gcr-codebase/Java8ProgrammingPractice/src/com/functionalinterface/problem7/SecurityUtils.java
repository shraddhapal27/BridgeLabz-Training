package com.functionalinterface.problem7;

public interface SecurityUtils {

    // Static method to check password strength
    static boolean isStrongPassword(String password) {
        // Password rules: min 8 chars, at least 1 uppercase, 1 lowercase, 1 digit, 1 special char
        if (password.length() < 8) return false;
        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else hasSpecial = true;
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
}
