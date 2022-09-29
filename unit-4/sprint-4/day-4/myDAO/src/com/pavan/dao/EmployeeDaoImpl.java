package com.pavan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pavan.exceptions.Employee3Exception;
import com.pavan.model.Employee3;
import com.pavan.utility.DBUtil;

public class EmployeeDaoImpl implements EmployeeDao{
	
	@Override
	public String insertEmployeeDetails(int eid, String name, String address, int salary) {

		String result = "Not Inserted";
		
		try(Connection conn= DBUtil.provideConnnection()){
			
			PreparedStatement ps = conn.prepareStatement("insert into Employee3 values(?,?,?,?)");
			
			ps.setInt(1, eid);
			ps.setString(2, name);
			ps.setString(3, address);
			ps.setInt(4, salary);
			
			int x = ps.executeUpdate();
			
			if(x > 0) result = "record inserted successfully";
			
		}catch(SQLException e) {
			result = e.getMessage();
		}
		
		return result;
	}

	
	
	@Override
	public String insertEmployeeDetails2(Employee3 employee) {
		
		String result = "Not Inserted";
		
		try(Connection conn= DBUtil.provideConnnection()){
			
			PreparedStatement ps = conn.prepareStatement("insert into Employee3 values(?,?,?,?)");
			
			ps.setInt(1, employee.getEid());
			ps.setString(2, employee.getName());
			ps.setString(3, employee.getAddress());
			ps.setInt(4, employee.getSalary());
			
			int x = ps.executeUpdate();
			
			if(x > 0) result = "record inserted successfully";
			
		}catch(SQLException e) {
			result = e.getMessage();
		}
		
		return result;
	}



	@Override
	public Employee3 getEmployeeDetailsByEid(int eid)throws Employee3Exception {
		
		Employee3 employee = null;

		try(Connection conn= DBUtil.provideConnnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from employee3 where eid = ?");
			
			ps.setInt(1, eid);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				int r = rs.getInt("eid");
				String n = rs.getString("name");
				String ad = rs.getString("address");
				int s = rs.getInt("salary");
				
				employee = new Employee3();
				employee.setEid(r);
				employee.setName(n);
				employee.setAddress(ad);
				employee.setSalary(s);
			}else 
				throw new Employee3Exception("Employee does not exist");
			
		}catch(SQLException e) {
			throw new Employee3Exception(e.getMessage());
		}
		return employee;
	}
	
	



	@Override
	public List<Employee3> getAllEmployeesDetails()throws Employee3Exception {
		List<Employee3> employee = new ArrayList<>();
		try(Connection conn= DBUtil.provideConnnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from employee3");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int r = rs.getInt("eid");
				String n = rs.getString("name");
				String ad = rs.getString("address");
				int s = rs.getInt("salary");
				
				Employee3 employe = new Employee3(r, n, ad, s);
				
				employee.add(employe);
				
			}
			
			if(employee.size()==0) {
				throw new Employee3Exception("No Employees are there");
			}
			
			
			
		}catch(SQLException e) {
			throw new Employee3Exception(e.getMessage());
		}
		return employee;
	}

	

}
