package com.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetAllDetails {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 String url = "jdbc:mysql://localhost:3306/db1";
		
		try(Connection conn = DriverManager.getConnection(url, "root", "Pavan@123")){
			PreparedStatement ps = conn.prepareStatement("Select * from employee");
					
			ResultSet rs = ps.executeQuery();
			int num = 1;
			boolean flag = true;
			while(rs.next()) {
				flag=false;
				int i = rs.getInt("eid");
				String n = rs.getString("name");
				String ad = rs.getString("address");
				Double sly = rs.getDouble("salary");
				
				System.out.println(num+" EmployeeId :"+i+", Employee Name: "+n+", Employee Address: "+ad+", Employee Salary: "+sly);
				System.out.println("==========================================================================================");
				num++;
			}
			if(flag) System.out.println("No Employee are there in database");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
			

	}

}
