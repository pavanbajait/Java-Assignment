package com.pavan.dao;

import java.util.List;

import com.pavan.exceptions.Employee3Exception;
import com.pavan.model.Employee3;

public interface EmployeeDao {

	public String insertEmployeeDetails(int eid, String name, String address, int salary);
	
	public String insertEmployeeDetails2(Employee3 employee);
	
	public Employee3 getEmployeeDetailsByEid(int eid) throws Employee3Exception;
	
	public List<Employee3> getAllEmployeesDetails()throws Employee3Exception;
	
	
}
