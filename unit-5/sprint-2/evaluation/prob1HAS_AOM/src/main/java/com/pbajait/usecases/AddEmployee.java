package com.pbajait.usecases;

import com.pbajait.dao.EmployeeDao;
import com.pbajait.dao.EmployeeDaoImpl;
import com.pbajait.model.Address;
import com.pbajait.model.Employee;

public class AddEmployee {

	public static void main(String[] args) {
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		Employee ep= new Employee();
		ep.setEmpName("Pankaj");
		ep.setSalary(40000);
		
		Address adr = new Address("MH", "Wardha", "442001", "Home");
		ep.getAddress().add(adr);
		
		dao.addEmployee(ep);

	}

}
