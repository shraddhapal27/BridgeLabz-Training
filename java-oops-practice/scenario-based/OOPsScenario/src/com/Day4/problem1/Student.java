package Day4.problem1;

public class Student extends Person implements ICourseActions {
   int[] grades;
   int gradeCount;
   Student(int id, String name, String email){
	   super(name,email,id);
	   grades = new int[5];
	   gradeCount = 0;
   }
   
   public void addGrade(int grade) {
	   if(gradeCount < grades.length) {
		   grades[gradeCount++] = grade;
	   }
   }
   
   public double calculateGPA() {
	   int sum = 0;
	   for(int i=0; i<gradeCount; i++) {
		   sum += grades[i];
	   }
	   return gradeCount == 0? 0: (double) sum / gradeCount;
   }
   
   @Override
   public void enrollCourse(Course course) {
	   course.addStudent(this);
   }
   
   @Override
   public void dropCourse(Course course) {
       course.removeStudent(this);
   }
   
   @Override
   void printDetails() {
       System.out.println("Student ID: " + id + ", Name: " + name +
               ", GPA: " + calculateGPA());
   }
}

