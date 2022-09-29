package com.pbajait.usecases;

import javax.persistence.EntityManager;

import com.pbajait.model.ConractualEmployee;
import com.pbajait.model.SalariedEmployee;
import com.pbajait.utility.DBUtil;

public class InsertRecord {

	public static void main(String[] args) {
		EntityManager em = DBUtil.provideEntityManager();
		
		SalariedEmployee semp = new SalariedEmployee();
		semp.setEmpName("Pavan");
		semp.setSalary(10000);
		semp.setEmail("pbajait@gmail.com");
		
		SalariedEmployee semp2 = new SalariedEmployee();
		semp2.setEmpName("aksh");
		semp2.setSalary(20000);
		semp2.setEmail("aksht@gmail.com");
		
		SalariedEmployee semp3 = new SalariedEmployee();
		semp3.setEmpName("Ppk");
		semp3.setSalary(15000);
		semp3.setEmail("pk@gmail.com");
		
		SalariedEmployee semp4 = new SalariedEmployee();
		semp4.setEmpName("shubham");
		semp4.setSalary(8000);
		semp4.setEmail("sughadet@gmail.com");
		
		ConractualEmployee cemp = new ConractualEmployee();
		cemp.setEmpName("Shubham");
		cemp.setCostofperday(300);
		cemp.setNoOfWorkingDays(30);
		cemp.setMobileNumber("9850412837");
		
		ConractualEmployee cemp1 = new ConractualEmployee();
		cemp1.setEmpName("vipul");
		cemp1.setCostofperday(500);
		cemp1.setNoOfWorkingDays(20);
		cemp1.setMobileNumber("9456312837");
		
		ConractualEmployee cemp2 = new ConractualEmployee();
		cemp2.setEmpName("nehal");
		cemp2.setCostofperday(250);
		cemp2.setNoOfWorkingDays(28);
		cemp2.setMobileNumber("9857896537");
		
		ConractualEmployee cemp3 = new ConractualEmployee();
		cemp3.setEmpName("ketki");
		cemp3.setCostofperday(400);
		cemp3.setNoOfWorkingDays(25);
		cemp3.setMobileNumber("985054667");
		
		em.getTransaction().begin();
		
		em.persist(cemp);
		em.persist(cemp2);
		em.persist(cemp3);
		em.persist(cemp1);
		em.persist(semp2);
		em.persist(semp3);
		em.persist(semp4);
		em.persist(semp);
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("Evaluation done...");
	}

}
