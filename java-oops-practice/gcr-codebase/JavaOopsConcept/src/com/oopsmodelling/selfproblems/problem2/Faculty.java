package com.oopsmodelling.selfproblems.problem2;

class Faculty {
    int facultyId;
    String facultyName;

    Faculty(int facultyId, String facultyName) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
    }

    void displayFaculty() {
        System.out.println("Faculty ID: " + facultyId +
                           ", Name: " + facultyName);
    }
}
