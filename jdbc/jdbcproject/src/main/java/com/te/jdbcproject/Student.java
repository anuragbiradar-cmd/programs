package com.te.jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Student {

public static void main(String[] args) throws SQLException {
	Connection con=null;
	Statement stmt=null;
	Driver driver=new Driver();
    DriverManager.registerDriver(driver);
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=Root@123");
    stmt=con.createStatement();
    boolean execute=stmt.execute("insert into emp values(4,'karan',12000)");
	
	
}

}
