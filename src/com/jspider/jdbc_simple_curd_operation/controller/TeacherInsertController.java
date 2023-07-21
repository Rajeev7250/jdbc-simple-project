package com.jspider.jdbc_simple_curd_operation.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TeacherInsertController {
	
	Connection connection = null;
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url ="jdbc:mysql//localhost:3306/jdbc-10am";
			String user ="root";
			String pass ="Rajeev@123";
			connection = DriverManager.getConnection(url,user,pass);
			
			Statement statement =connection.createstatement();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
