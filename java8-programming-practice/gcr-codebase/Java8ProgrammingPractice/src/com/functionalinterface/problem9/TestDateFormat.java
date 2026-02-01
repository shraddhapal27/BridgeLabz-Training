package com.functionalinterface.problem9;

import java.time.LocalDate;

public class TestDateFormat {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        System.out.println("Default format: " + today);
        System.out.println("dd-MM-yyyy: " + DateUtils.formatDate(today, "dd-MM-yyyy"));
        System.out.println("MMMM dd, yyyy: " + DateUtils.formatDate(today, "MMMM dd, yyyy"));
    }
}
