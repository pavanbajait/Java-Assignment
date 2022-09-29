package com.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class PreStatement {

	 public static void main(String args[]){
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Do you want add employees (yes/no):");
		 String wish=sc.next();
		  
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 String url = "jdbc:mysql://localhost:3306/db1";
		
		try(Connection conn = DriverManager.getConnection(url, "root", "Pavan@123")){
			int x = 0;
			while(wish.equalsIgnoreCase("yes")) {
				 System.out.println("Enter the Employee Id :");
				 int eid = sc.nextInt();
				 System.out.println("Enter the Employee Name :");
				 String name = sc.next();
				 System.out.println("Enter the Employee Address");
				 String address = sc.next();
				 System.out.println("Enter the Employee Salary");
				 Double salary = sc.nextDouble();
				PreparedStatement ps = conn.prepareStatement("insert into Employee values(?,?,?,?)");
			
				ps.setInt(1, eid);
				ps.setString(2, name);
				ps.setString(3, address);
				ps.setDouble(4, salary);
				
				 x = ps.executeUpdate();
				
				System.out.println("Do you want to add Employee details(yes/no):");
				wish = sc.next();
			}
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
