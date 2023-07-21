package com.jspider.jdbc_simple_curd_operation.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class StudentDetailsFetch {

		
		public static void main(String[] args) {
			
			//Step 1: load/Register Drive
			try {
				Class.forName("com.mysql.cj.jdbc.Drive");
				
				//step 2: Create Connection
				String url = "jdbc:mysql//localhost:3306/jdbc-10am";
				String user = "root";
				String pass = "Rajeev@123";
				
				Connection connection = DriverManager.getConnection(url,user,pass);
				
				//step 3: create statement
				Statement statement = connection.createStatement();
				
				//step 4: executeQuery
				
				String displayAllStudentQuery = "Select * from student";
				
				Resultset resultSet =statement.execute(displayAllStudentQuery);
				
				
				
				
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
