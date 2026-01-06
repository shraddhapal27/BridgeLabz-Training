package Day4.problem1;

public class CampusConnect {
    public static void main(String[] args) {
    	Faculty faculty = new Faculty(123, "abc","abc@gmail.com");
    	

        Student s1 = new Student(101, "Amit", "amit@gmail.com");
        Student s2 = new Student(102, "Neha", "neha@gmail.com");
        

        s1.addGrade(8);
        s1.addGrade(9);
        s2.addGrade(7);
        s2.addGrade(8);
        
        Course javaCourse = new Course("Java Programming", faculty);

        s1.enrollCourse(javaCourse);
        s2.enrollCourse(javaCourse);

        javaCourse.showCourseDetails();
    }
}
