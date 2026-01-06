package Day4.problem1;

import java.util.ArrayList;
public class Course {
	private String courseName;
    private Faculty faculty;
    ArrayList<Student> students;
    
    Course(String courseName, Faculty faculty){
    	this.courseName = courseName;
        this .faculty = faculty;
        students = new ArrayList<>();	
    }
    void addStudent(Student student) {
    	students.add(student);
    }
    void removeStudent(Student student) {
    	students.remove(student);
    }
    
    void showCourseDetails() {
        System.out.println("\nCourse: " + courseName);
        faculty.printDetails();
        System.out.println("Enrolled Students:");
        for (Student s : students) {
            s.printDetails();
        }
    }
}

