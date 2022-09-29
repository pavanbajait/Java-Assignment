package com.Prob1;
import java.sql.Connection;
import java.sql.DriverManager;

public class GetConnection {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/db1";
		Connection conn = null;
		try{
			conn = DriverManager.getConnection(url,"root","Pavan@123");
		}catch(Exception e) {
			e.printStackTrace();
		}
		if(conn != null) {
			System.out.println("Connction created...");
		}
	}

}
