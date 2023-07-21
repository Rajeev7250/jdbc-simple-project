package com.jspider.jdbc_simple_curd_operation.controller;

 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class updateStudentController {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the student id for update email:");
		int id = sc.nextInt();
		
		System.out.println("Enter new email to update:");
		String email =sc.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url ="jdbc:mysql://localhost:3306/jdbc-10am";
			String user ="root";
			String pass ="Rajeev@123";
			
			Connection connection=DriverManager.getConnection(url,user,pass);
			
			Statement Statement = connection.createStatement();
			
			String updateStudentEmailQuery ="update student set email = '"+email+"' where id ="+id;
			
			int a =Statement.executeUpdate(updateStudentEmailQuery);
			if(a==1) {
				System.out.println("Data-------updated------");
			}else {
					System.out.println("given id is not present");
				}
						
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
