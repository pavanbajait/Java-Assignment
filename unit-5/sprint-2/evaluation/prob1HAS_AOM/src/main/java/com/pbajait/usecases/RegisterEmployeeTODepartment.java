package com.pbajait.usecases;

import com.pbajait.dao.EmployeeDao;
import com.pbajait.dao.EmployeeDaoImpl;
import com.pbajait.model.Address;
import com.pbajait.model.Department;
import com.pbajait.model.DepartmentException;
import com.pbajait.model.Employee;
import com.pbajait.model.EmployeeException;

public class RegisterEmployeeTODepartment {

	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDaoImpl();

		Department dept = new Department();
		dept.setDeptName("Service");
		dept.setLocation("Ngp");
		
		Employee ep= new Employee();
		ep.setEmpName("Panvanj");
		ep.setSalary(5000);
		
		Address adr = new Address("MH", "Arvi", "442201", "Office");
		ep.getAddress().add(adr);
		
		try {
			dao.registerEmployeeTODepartment(1, 4);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DepartmentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
