package Day4.problem1;

public class Faculty extends Person {
     Faculty(int id, String name, String email){
    	 super(name,email,id);
     }
     
     @Override
     void printDetails() {
    	 System.out.println("Faculty ID: " + id + ", Name: " + name +
                 ", Email: " + email);
     }
     
}
