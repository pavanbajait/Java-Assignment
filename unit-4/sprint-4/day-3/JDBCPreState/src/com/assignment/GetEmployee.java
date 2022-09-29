package com.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class GetEmployee {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the Employee ID to get the Employee details");
		int eid = sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 String url = "jdbc:mysql://localhost:3306/db1";
		
		try(Connection conn = DriverManager.getConnection(url, "root", "Pavan@123")){
			PreparedStatement ps = conn.prepareStatement("Select * from employee where eid = ?");
					
			ps.setInt(1, eid);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				int i = rs.getInt("eid");
				String n = rs.getString("name");
				String ad = rs.getString("address");
				Double sly = rs.getDouble("salary");
				
				System.out.println(" EmployeeId :"+i+", Employee Name: "+n+", Employee Address: "+ad+", Employee Salary: "+sly);
				System.out.println("==========================================================================================");
			
			}else 
				System.out.println("Employee does not exist with employee Id "+ eid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
