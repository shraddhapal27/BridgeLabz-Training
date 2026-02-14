package com.jdbc.JdbcDemo.transactionmanagement;


import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    static String URL =
        "jdbc:mysql://localhost:3306/jdbc_practice";

    static String USER = "root";
    static String PASS = "root";

    public static Connection getConnection() throws Exception {

        return DriverManager.getConnection(URL, USER, PASS);
    }
}
