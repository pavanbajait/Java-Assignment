package com.pbajait.daoInterface;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.pbajait.Employee;

public class EmployeeDaoImpl implements EmployeeDAO{
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeeUnit");


	@Override
	public void save(Employee emp) {
		EntityManager em = emf.createEntityManager();
		
		int empId = emp.getEmpId();
		String name = emp.getName();
		String address = emp.getAddress();
		int salary = emp.getSalary();
		
		Employee empl = new Employee(empId, name, address, salary);
		
		em.getTransaction().begin();
		
		em.persist(empl);
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("Insertion done....");
	}

	@Override
	public String getAddressOfEmployee(int empId) {
		EntityManager em = emf.createEntityManager();
		
		Employee emp = em.find(Employee.class, empId);
		
		em.close();
		
		if(emp != null) {
			em.close();
			return emp.getAddress();
		}
		else {
			em.close();
			return "Employee does not exist";
		}
	}

	@Override
	public String giveBonusToEmployee(int empId, int bonus) {
		EntityManager em = emf.createEntityManager();
		
		Employee emp = em.find(Employee.class, empId);
		
		if(emp == null) {
			em.close();
			return "Employee does not exist";
		}else {
			em.getTransaction().begin();
			
			emp.setSalary(emp.getSalary()+bonus);
			
//			em.merge(emp);
			
			em.getTransaction().commit();
			
			em.close();
			
			return "Bonus added";
		}
	}

	@Override
	public boolean deleteEmployee(int empId) {
		EntityManager em = emf.createEntityManager();
		
		Employee emp = em.find(Employee.class, empId);
		
		if(emp == null) {
			em.close();
			return false;
		}else {
			em.getTransaction().begin();
			
			em.remove(emp);
			
			em.getTransaction().commit();
			
			em.close();
			
			return true;
		}
	}
	
	

}
