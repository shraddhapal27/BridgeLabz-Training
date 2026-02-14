package com.jdbc.JdbcDemo.crudapplication;

import java.sql.*;
import java.util.Scanner;
public class EmployeeCRUD {
    static Scanner sc = new Scanner(System.in);
    
    // add employee
    public static void addEmployee() throws Exception{
    	Connection con = DBConnection.getConnection();
    
    	  System.out.print("Enter name: ");
          String name = sc.next();

          System.out.print("Enter salary: ");
          double salary = sc.nextDouble();
          
          String query = "insert into employee(name,salary) values(?,?)";
          PreparedStatement pst = con.prepareStatement(query);
          pst.setString(1, name);
          pst.setDouble(2, salary);
          
          pst.executeUpdate();
          System.out.println("Salary updated");
    }
    
    // delete employee
    public static void deleteEmployee() throws Exception{
    	Connection con = DBConnection.getConnection();
    	
    	 System.out.print("Enter ID: ");
         int id = sc.nextInt();

         String query = "DELETE FROM employee WHERE id=?";

         PreparedStatement ps = con.prepareStatement(query);

         ps.setInt(1, id);

         ps.executeUpdate();

         System.out.println("Employee Deleted");
    }
    // View Employees
    public static void viewEmployees() throws Exception {

        Connection con = DBConnection.getConnection();

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("SELECT * FROM employee");

        while(rs.next()) {

            System.out.println(
                rs.getInt("id") + " " +
                rs.getString("name") + " " +
                rs.getDouble("salary")
            );
        }
    }
    
    
    // Update Salary
    public static void updateSalary() throws Exception {

        Connection con = DBConnection.getConnection();

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        System.out.print("Enter new salary: ");
        double salary = sc.nextDouble();

        String query = "UPDATE employee SET salary=? WHERE id=?";

        PreparedStatement ps = con.prepareStatement(query);

        ps.setDouble(1, salary);
        ps.setInt(2, id);

        ps.executeUpdate();

        System.out.println("Salary Updated");
    }
    
    // search by name
    public static void searchEmployee() throws Exception {

        Connection con = DBConnection.getConnection();

        System.out.print("Enter name: ");
        String name = sc.next();

        String query = "SELECT * FROM employee WHERE name=?";

        PreparedStatement ps = con.prepareStatement(query);

        ps.setString(1, name);

        ResultSet rs = ps.executeQuery();
        
        while(rs.next()) {
        	System.out.println(
        			rs.getInt("id")+ " " +
        	        rs.getString("name")+ " "+
        		    rs.getDouble("salary")
        			);
        }
    }
}
