package com.constructor.level1;

class Manager extends Employee {

    String managerLevel;

    Manager(int employeeID, String department,
            double salary, String managerLevel) {
        super(employeeID, department, salary);
        this.managerLevel = managerLevel;
    }

    void displayManagerDetails() {
        System.out.println("Employee ID   : " + employeeID); // public
        System.out.println("Department    : " + department);  // protected
        System.out.println("Salary        : ₹" + getSalary()); // private via method
        System.out.println("Manager Level : " + managerLevel);
    }
}
