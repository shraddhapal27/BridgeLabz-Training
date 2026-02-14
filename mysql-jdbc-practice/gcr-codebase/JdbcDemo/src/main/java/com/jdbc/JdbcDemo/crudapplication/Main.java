package com.jdbc.JdbcDemo.crudapplication;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
		    System.out.println("\n1 Add");
            System.out.println("2 View");
            System.out.println("3 Update");
            System.out.println("4 Delete");
            System.out.println("5 Search");
            System.out.println("6 Exit");

            int choice = sc.nextInt();	
            switch(choice) {

            case 1: EmployeeCRUD.addEmployee(); break;
            case 2: EmployeeCRUD.viewEmployees(); break;
            case 3: EmployeeCRUD.updateSalary(); break;
            case 4: EmployeeCRUD.deleteEmployee(); break;
            case 5: EmployeeCRUD.searchEmployee(); break;
            case 6: System.exit(0);
        }
		}

	}

}
