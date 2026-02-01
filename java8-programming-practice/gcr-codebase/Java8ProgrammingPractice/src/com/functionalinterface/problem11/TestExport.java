package com.functionalinterface.problem11;

public class TestExport {
    public static void main(String[] args) {
        Exporter report = new ReportModule();
        report.exportToCSV();
        report.exportToPDF();
        report.exportToJSON();
    }
}
