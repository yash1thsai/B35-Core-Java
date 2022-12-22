package com.cg.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeDAO {

	public Connection createConnection()
	{
		String url="jdbc:mysql://localhost:3306/B35";
		String user="root";
		String password="Yashwanth@77";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Class not found");
		}
		
		Connection c;
		
		try {
			c=DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Check the URl/USER/PASSWORD");
			c=null;
		}
		return c;
		
	}
	
}
