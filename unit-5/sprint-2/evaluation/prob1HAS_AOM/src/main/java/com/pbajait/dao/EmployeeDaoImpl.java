package com.pbajait.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.pbajait.model.Department;
import com.pbajait.model.DepartmentException;
import com.pbajait.model.Employee;
import com.pbajait.model.EmployeeException;
import com.pbajait.utility.DBUtil;

public class EmployeeDaoImpl implements EmployeeDao{
	EntityManager em = DBUtil.provideEntityManager();

	public void addDepartment(Department dept) {
		
		EntityManager em = DBUtil.provideEntityManager();

		Department dep = new Department();
		dep.setDeptName(dept.getDeptName());
		dep.setLocation(dept.getLocation());
		dept.setEmps(dept.getEmps());
		
		em.getTransaction().begin();
		
		em.persist(dep);
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("Department added sucesfully...");
				
	}

	public void addEmployee(Employee emp) {
		
		EntityManager em = DBUtil.provideEntityManager();

		Employee empl = new Employee();
		empl.setEmpName(emp.getEmpName());
		empl.setSalary(emp.getSalary());
		empl.setAddress(emp.getAddress());

		em.getTransaction().begin();
		
		em.persist(empl);
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("Employee added sucesfully...");

	}

	public void registerEmployeeTODepartment(int empId, int deptId) throws EmployeeException, DepartmentException {
		


		 Employee employee = em.find(Employee.class, empId);
	        Department department = em.find(Department.class, deptId);
	        System.out.println(department);
	        System.out.println(employee);
	         if(department==null){
	             throw new DepartmentException("Department does not Exist");
	         }
	         if(employee==null){
	             throw new EmployeeException("Employee doesn't exist");
	         }
	         else{
	             employee.setDept(department);
	             department.getEmps().add(employee);
	             em.getTransaction().begin();

	            Department department1=  em.merge(department);

	             em.getTransaction().commit();
	             em.close();
	             System.out.println(department1);
	             System.out.println("done...");

	         }
		
	}
	
	   public List<Employee> getAllEmployeeWithDeptName(String deptName) throws EmployeeException {
	        List<Employee> allemps = null;

	        String jpql = "select employeeSet from Department where name = ?1";

	        Query q = em.createQuery(jpql);

	        q.setParameter(1, deptName);

	        allemps= q.getResultList();

	        if (allemps.size()==0) throw new EmployeeException("No employee found!");



	        em.close();

	        if (allemps.isEmpty()) throw new EmployeeException("No employee found!");

	        return allemps;
	    }

	    public Department getDepartmentDetailsByEmployeeId(int empId) throws DepartmentException {

	        Employee emp = em.find(Employee.class, empId);

	       Department dept = emp.getDept();

	        em.close();

	        if(dept == null ) throw new DepartmentException("No departement found!");

	        return dept;
	    }

}
