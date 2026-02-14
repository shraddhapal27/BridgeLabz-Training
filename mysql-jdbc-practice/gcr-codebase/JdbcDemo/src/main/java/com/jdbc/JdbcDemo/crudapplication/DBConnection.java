package com.jdbc.JdbcDemo.crudapplication;

import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
    static final String URL = "jdbc:mysql//localhost:3306/jdbc_practice";
    static final String user = "root";
    static final String pass = "it.is.sql.123()";
    
    public static Connection getConnection()throws Exception{
    	return DriverManager.getConnection(URL,user,pass);
    }


}
