package Day4.problem1;

public class Person {
     String name;
     String email;
     int id;
     
     Person(String name, String email, int id){
    	 this.name = name;
    	 this.email = email;
    	 this.id = id;
     }
     
     void printDetails() {
    	 System.out.println("ID: " + id + ", Name: " + name + ". Email: " + email);
     }
}
