package com.functionalinterface.problem9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface DateUtils {

    // Format a LocalDate in multiple patterns
    static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}
