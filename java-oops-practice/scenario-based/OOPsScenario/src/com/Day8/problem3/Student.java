package com.Day8.problem3;

class Student extends User implements ICertifiable {
    private int progress; // percentage

    public Student(String name, String email) {
        super(name, email);
    }

    public void updateProgress(int completedModules, int totalModules) {
        progress = (completedModules * 100) / totalModules; // operator usage
    }

    @Override
    public void generateCertificate() {
        if (progress >= 80)
            System.out.println("Certificate: Completion with Excellence 🏆");
        else
            System.out.println("Certificate: Course Completed ✅");
    }

    public int getProgress() {
        return progress;
    }
}

class Instructor extends User {
    public Instructor(String name, String email) {
        super(name, email);
    }
}