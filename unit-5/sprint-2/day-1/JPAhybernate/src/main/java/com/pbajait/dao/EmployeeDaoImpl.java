package com.pbajait.dao;

import javax.persistence.EntityManager;

import com.pbajait.model.Employee;
import com.pbajait.usecases.EmployeeException;
import com.pbajait.utility.EMUtil;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public Employee registerEmployee(Employee employee) throws EmployeeException {
				
		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		if(em != null)
			em.persist(employee);
		else 
			throw new EmployeeException("Connection error");
		
		em.getTransaction().commit();
		em.close();
		return employee;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException{
		EntityManager em = EMUtil.provideEntityManager();
		Employee emp = null;
		
		emp = em.find(Employee.class, empId);
		em.close();
		if(emp!= null)
			return emp;
		else
			throw new EmployeeException("Employee does not exist");
		
		
	}

	@Override
	public Employee deleteEmployeeById(int empId) throws EmployeeException {
		EntityManager em = EMUtil.provideEntityManager();
		Employee emp = null;
		
		emp = em.find(Employee.class, empId);
		if(emp!= null) {
			em.getTransaction().begin();
			em.remove(emp);
			em.getTransaction().commit();
			em.close();
			return emp;
		}else {
			throw new EmployeeException("Employee does not exist");
		}
		
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
		EntityManager em = EMUtil.provideEntityManager();

		if(employee!= null) {
			em.getTransaction().begin();
			em.merge(employee);
			em.getTransaction().commit();
			em.close();
			return employee;
		}else {
			throw new EmployeeException("Employee does not exist");
		}
	}

}
