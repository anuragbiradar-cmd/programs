package com.te.jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class App 
{
    public static void main( String[] args )
    {
    	Connection con=null;
    	Statement stmt=null;
        try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=Root@123");
			stmt=con.createStatement();
			stmt.execute("create table emp(id int,name varchar(40),salary double)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        finally{
        	if(con!=null) {
        		try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	if(stmt!=null) {
        		try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        	}
        }
    }
}
