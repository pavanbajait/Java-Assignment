package com.pbajait.usecases;

import com.pbajait.dao.EmployeeDao;
import com.pbajait.dao.EmployeeDaoImpl;
import com.pbajait.model.Address;
import com.pbajait.model.Department;
import com.pbajait.model.Employee;

public class AddDept {

	public static void main(String[] args) {
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		Department dept = new Department();
		dept.setDeptName("HR");
		dept.setLocation("Ngp");
		
		
		dao.addDepartment(dept);
		

	}

}
