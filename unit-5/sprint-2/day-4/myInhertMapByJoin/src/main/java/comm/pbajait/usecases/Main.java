package comm.pbajait.usecases;

import javax.persistence.EntityManager;

import com.pbajait.model.Address;
import com.pbajait.model.Employee;
import com.pbajait.model.Person;
import com.pbajait.utility.EMUtil;

public class Main {
	
	public static void main(String[] args) {
		
		EntityManager em=EMUtil.provideEntityManager();
		
//		Person person = new Person();

		Employee emp = new Employee();
		emp.setName("Ram");
		emp.setSalary(40000);
		
		Address home = new Address();
		home.setCity("Hgt");
		home.setState("MH");
		home.setPincode("442301");
		
		Address office = new Address();
		office.setCity("Ngp");
		office.setState("MH");
		office.setPincode("440001");
		
		emp.setHomeAddress(home);
		emp.setOfficeAddress(office);
		

		em.getTransaction().begin();
		
		em.persist(emp);
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("done...");
		
	}

}
