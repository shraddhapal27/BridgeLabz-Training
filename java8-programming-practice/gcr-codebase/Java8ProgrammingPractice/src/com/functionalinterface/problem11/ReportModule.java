package com.functionalinterface.problem11;

public class ReportModule implements Exporter {
    @Override
    public void exportToCSV() {
        System.out.println("Exported data to CSV");
    }

    @Override
    public void exportToPDF() {
        System.out.println("Exported data to PDF");
    }
}
