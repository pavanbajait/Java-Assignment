package com.myDao.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.myDao.exceptions.EmployeeException;
import com.myDao.modelBean.Employee;
import com.myDao.utility.DBUtil;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public String insertEmployeeDetails(int empId, String name, String address, int salary) {
		
		String result = "Not inserted..............";
		
		try(Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("insert into emp values(?,?,?,?)");
			
			ps.setInt(1, empId);
			ps.setString(2, name);
			ps.setString(3, address);
			ps.setInt(4, salary);
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				result = "records inserted......";
			}
			
		}catch (SQLException e) {
			result = e.getMessage();
		}
			
		
		return result;
	}

	@Override
	public List<Employee> getAllEmployee() throws EmployeeException{
		List<Employee> list = new ArrayList<>();
		try(Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from emp");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int i = rs.getInt("empId");
				String n = rs.getString("name");
				String a = rs.getString("address");
				int s = rs.getInt("salary");
				
				Employee employee = new Employee();
				employee.setEmpId(i);
				employee.setName(n);
				employee.setAddress(a);
				employee.setSalary(s);
				
				list.add(employee);
				
			}
			if(list.size() == 0) 
				throw new EmployeeException("No Students are there in Database");
			
		}catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
		}
		return list;
	}

	@Override
	public String giveBonusToEmployee(int empId, int bonus) {
		String result = "Not inserted..............";
		
		try(Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("Update Employee set salary = salary + ? WHERE empId = ?");
						
			ps.setInt(1, bonus);
			ps.setInt(2, empId);
			
			int x = ps.executeUpdate();
			
			if(x > 0) {
				result ="Bonus Updated to Salary of Employee ";	
			}else {
				result = "Employee Does not exist/found";
			}
			
			
		}catch (SQLException e) {
			result = e.getMessage();
		}
			
		
		return result;
	}


	@Override
	public boolean deleteEmployee(int empId) {
		boolean result = false;
		
		try(Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("delete from employee where empId = ?");
			
			ps.setInt(1, empId);
						
			int x = ps.executeUpdate();
			
			if(x>0) {
				result = true;
			}
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
			
		
		return result;
	}

	
	@Override
	public String[] getNameAndAddress(int empId) throws EmployeeException{
		String[] arr = new String[2];
		
		try(Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select name, address from employee WHERE empId = ?");
			
			ps.setInt(1, empId);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				arr[0] = rs.getString("name");
				arr[1] = rs.getString("address");
								
			}
			if(arr.length == 0) 
				throw new EmployeeException("Employee Does not found");
			
		}catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
		}
		
			
		return arr;
	}

	
	
}
