package com.CSV.question13;

import java.sql.*;
import java.io.*;

public class DBToCSV {
    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/db","user","pass");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM employee");

        BufferedWriter bw = new BufferedWriter(new FileWriter("db_employees.csv"));
        bw.write("ID,Name,Department,Salary\n");

        while (rs.next()) {
            bw.write(rs.getInt(1) + "," +
                     rs.getString(2) + "," +
                     rs.getString(3) + "," +
                     rs.getDouble(4) + "\n");
        }
        bw.close();
        con.close();
    }
}
