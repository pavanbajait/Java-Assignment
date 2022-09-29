package com.pbajait.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;


import javax.persistence.Query;
import com.pbajait.model.Employee;
import com.pbajait.model.EmployeeException;
import com.pbajait.utility.DBUtil;


public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public List<Employee> getAllEmployees() throws EmployeeException {
		
		EntityManager em= DBUtil.provideEntityManager();
		
		//String jpql= "select a from Employee a";
		
		String jpql= "from Employee";
	
		Query q= em.createQuery(jpql);
		
		
			List<Employee> list= q.getResultList();
//			list.isEmpty()
			if(list.size()==0) {
				throw new EmployeeException("Employees are not found");
			}else {	
			    return list;
		}
	}

	@Override
	public List<Employee> getEmployeesByAddress(String address) throws EmployeeException {
		EntityManager em= DBUtil.provideEntityManager();
		
		//String jpql= "select a from Employee a";
		
		String jpql= "from Employee where address = ?1";
	
		Query q= em.createQuery(jpql);
		
		q.setParameter(1, address);
		
		List<Employee> list= q.getResultList();
	
		if(list.isEmpty()) {
			throw new EmployeeException("Employees are not found");
		}else {	
			    return list;
		}
	}

	@Override
	public List<Employee> getAllEmployeeWithRangeSalary(int startSalary, int endSalary) throws EmployeeException {
		EntityManager em= DBUtil.provideEntityManager();
			
		String jpql= "from Employee where salary BETWEEN :str AND :end";
	
		Query q= em.createQuery(jpql);
		
		q.setParameter("str", startSalary);
		q.setParameter("end", endSalary);
		
		List<Employee> list= q.getResultList();
	
		if(list.isEmpty()) {
			throw new EmployeeException("Employees are not found");
		}else {	
			    return list;
		}
	}

	@Override
	public Object[] getEmployeeNameAndSalary(int empId) throws EmployeeException {
		EntityManager em= DBUtil.provideEntityManager();
				
		String jpql= "Select e.name, e.salary from Employee e where e.empId = ?1";
	
//		Query q= em.createQuery(jpql);
//		
//		q.setParameter(1, empId);
//				
//		Object obj = q.getSingleResult();
//		
//		Object[] or = (Object[])obj;
		
		/*another approach by typedquery
		 **/
		TypedQuery<Object[]> tq= em.createQuery(jpql, Object[].class);

		tq.setParameter(1, empId);
		
		Object[] or = tq.getSingleResult();
	
		if(or.length==0) {
			throw new EmployeeException("Employees does not found with this empId");
		}else {	
			    return or;
		}
	}

	@Override
	public int getEmployeeSalaryById(int empId) {
		EntityManager em= DBUtil.provideEntityManager();
		
		String jpql= "Select e.salary from Employee e where e.empId = ?1";

		Query q= em.createQuery(jpql);

		q.setParameter(1, empId);
		
		Object res = q.getSingleResult();
				
//		res=null;
		if(res==null) {
			 System.out.println("Employees does not found with this empId");
		}else {	
			int slry = (Integer)res;
		    return slry;
		}
		return empId;
	}
	
	

}
