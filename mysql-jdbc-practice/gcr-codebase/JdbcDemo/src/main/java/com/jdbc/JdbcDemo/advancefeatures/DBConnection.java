package com.jdbc.JdbcDemo.advancefeatures;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    static String url =
        "jdbc:mysql://localhost:3306/jdbc_practice";

    static String user = "root";
    static String pass = "root";

    public static Connection getConnection() throws Exception {

        return DriverManager.getConnection(url, user, pass);
    }
}
