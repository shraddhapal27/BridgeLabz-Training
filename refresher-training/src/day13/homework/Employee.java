package day13.homework;

public class Employee {
    private String name;
    private static int nextId = 1001;
    private int employeeId;

    Employee(String name){
        this.name = name;
        this.employeeId = nextId;
        nextId++;
    }

    public int getEmployeeId(){
        return employeeId;
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Rahul");
        Employee e2 = new Employee("Aman");
        Employee e3 = new Employee("Priya");
        Employee e4 = new Employee("Neha");

        System.out.println(e1.getName() + " : " + e1.getEmployeeId());
        System.out.println(e2.getName() + " : " + e2.getEmployeeId());
        System.out.println(e3.getName() + " : " + e3.getEmployeeId());
        System.out.println(e4.getName() + " : " + e4.getEmployeeId());
    }
}
