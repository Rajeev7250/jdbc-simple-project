package com.jspider.jdbc_simple_curd_operation.controller;
	
	import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class StudentInsertController {
	
	public static void main(String[] args) {
		Connection connection=null;
		try {
			//step-1 load/register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step-2 create Connection
			String url = "jdbc:mysql://localhost:3306/jdbc-10am";
			String user = "root";
			String pass = "Rajeev@123";
			connection = DriverManager.getConnection(url,user,pass);
			//step-3 create statement
			Statement statement=connection.createStatement();
			
			//step-4 executeQuery
			String insertStudentQuery ="insert into student(id,name,email,phone,studentcol) values(1004,'jon','jon23@gmail.com',8379554456,'null')";
			
			
			statement.execute(insertStudentQuery);
			
			System.out.println("+++++++++++++++++++Data--------Stored++++++++");
		} catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	}