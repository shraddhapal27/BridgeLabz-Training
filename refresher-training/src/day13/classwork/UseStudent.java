package day13;

class Student {
    static String schoolName = " Hansraj Modern School"; // instance var
    String name;
    int rollNo;
    String id;

//    void print(){
//        System.out.println("name: " + name + " rollno: " + rollNo);
//    }
    Student(String name, int rollNo, String id){
        this.name = name;
        this.rollNo = rollNo;
        this.id = id;
    }
    void print(){
        System.out.println("name: " + name + " rollNo: " + rollNo + " school Name: "+ schoolName);
    }
}

public class UseStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Shraddha", 27, "0101"); // s1 is reference var
       s1.print();
       Student s2 = new Student("Rashi", 01, "9191");
       s2.print();
       Student.schoolName = "abc";
       s2.print();


    }
}