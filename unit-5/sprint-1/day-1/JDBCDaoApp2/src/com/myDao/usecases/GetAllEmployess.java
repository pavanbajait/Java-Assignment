package com.myDao.usecases;

import java.util.List;

import com.myDao.Dao.EmployeeDao;
import com.myDao.Dao.EmployeeDaoImpl;
import com.myDao.exceptions.EmployeeException;
import com.myDao.modelBean.Employee;

public class GetAllEmployess {

	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDaoImpl();
		
		try {
			List<Employee> lists = dao.getAllEmployee();
			
			lists.forEach(em -> {
				System.out.println(em);
			});
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}

	}

}
