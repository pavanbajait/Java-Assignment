package com.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateBonus {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the bonus which need to add in salary");
		Double d = sc.nextDouble();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 String url = "jdbc:mysql://localhost:3306/db1";
		int x = 0;
		try(Connection conn = DriverManager.getConnection(url, "root", "Pavan@123")){
			PreparedStatement ps = conn.prepareStatement("Update employee set salary = salary +"+d+"");
					
			
			 x = ps.executeUpdate();
			
		if(x>0) {
			System.out.println(x+" Records inserted successfully");
		}else {
			System.out.println("Not Inserted");
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
		
	}

}
