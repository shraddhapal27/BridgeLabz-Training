package com.functionalinterface.problem11;

public interface Exporter {
    void exportToCSV();
    void exportToPDF();

    // Default method for JSON export
    default void exportToJSON() {
        System.out.println("Exported data to JSON (default method).");
    }
}
