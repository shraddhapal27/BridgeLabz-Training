package com.Day1.resumeanalyzer;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class ResumeAnalyzer {
    private Map<String, ResumeData> resumeIndex = new HashMap<>();
    private List<ResumeData> sortedResumes = new ArrayList<>();
    
    static class ResumeData {
        String email, phone, filename;
        Set<String> keywords = new HashSet<>();
        int keywordMatchCount;
        
        ResumeData(String email, String phone, String filename) {
            this.email = email;
            this.phone = phone;
            this.filename = filename;
        }
    }
    
    public void processResumesFolder(String folderPath) {
        try {
            Files.walk(Paths.get(folderPath))
                .filter(Files::isRegularFile)
                .filter(p -> p.toString().matches(".*\\.(txt|pdf)"))
                .forEach(this::processResume);
            
            sortByKeywordMatch();
        } catch (IOException e) {
            System.err.println("Error reading folder: " + e.getMessage());
        }
    }
    
    private void processResume(Path filePath) {
        try (BufferedReader reader = getReader(filePath)) {
            String content = reader.lines().collect(Collectors.joining("\n"));
            ResumeData data = extractResumeData(content, filePath.toString());
            
            if (data.email != null) {
                resumeIndex.put(data.email, data);
            }
        } catch (Exception e) {
            System.err.println("Skipping invalid resume: " + filePath + " - " + e.getMessage());
        }
    }
    
    private BufferedReader getReader(Path filePath) throws IOException {
        String filename = filePath.toString().toLowerCase();
        if (filename.endsWith(".pdf")) {
            throw new UnsupportedOperationException("PDF parsing not implemented");
        }
        return Files.newBufferedReader(filePath);
    }
    
    private ResumeData extractResumeData(String content, String filename) {
        ResumeData data = new ResumeData(extractEmail(content), extractPhone(content), filename);
        
        // Extract keywords
        Pattern keywordPattern = Pattern.compile("\\b(Java|Python|Spring)\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = keywordPattern.matcher(content);
        while (matcher.find()) {
            data.keywords.add(matcher.group());
        }
        data.keywordMatchCount = data.keywords.size();
        
        return data;
    }
    
    private String extractEmail(String content) {
        Pattern emailPattern = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b");
        Matcher matcher = emailPattern.matcher(content);
        return matcher.find() ? matcher.group() : null;
    }
    
    private String extractPhone(String content) {
        Pattern phonePattern = Pattern.compile("\\b(?:\\+?\\d{1,3}[-.]?)?\\(?\\d{3}\\)?[-.]?\\d{3}[-.]?\\d{4}\\b");
        Matcher matcher = phonePattern.matcher(content);
        return matcher.find() ? matcher.group() : null;
    }
    
    private void sortByKeywordMatch() {
        sortedResumes = new ArrayList<>(resumeIndex.values());
        sortedResumes.sort((a, b) -> Integer.compare(b.keywordMatchCount, a.keywordMatchCount));
    }
    
    public void printResults() {
        System.out.println("=== Top Resumes by Keyword Match ===");
        sortedResumes.forEach(r -> 
            System.out.printf("%s (%d matches) - %s | %s%n", 
                r.filename, r.keywordMatchCount, r.email, r.phone));
    }
    
    // Test main
    public static void main(String[] args) {
        ResumeAnalyzer analyzer = new ResumeAnalyzer();
        analyzer.processResumesFolder("./resumes");
        analyzer.printResults();
    }
}

