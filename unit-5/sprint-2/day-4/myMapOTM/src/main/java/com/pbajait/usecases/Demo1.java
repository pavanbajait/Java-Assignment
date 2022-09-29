package com.pbajait.usecases;

import javax.persistence.EntityManager;

import com.pbajait.model.Course;
import com.pbajait.model.Student;
import com.pbajait.utility.EMUtil;

public class Demo1 {

	public static void main(String[] args) {
		EntityManager em=EMUtil.provideEntityManager();

		Course cs1 = new Course();
		cs1.setCourseName("DSA");
		cs1.setDuration(6);
		cs1.setFee(10000);
		
		Course cs2 = new Course();
		cs2.setCourseName("JAVA");
		cs2.setDuration(5);
		cs2.setFee(20000);
				
		Course cs3 = new Course();
		cs3.setCourseName("SPRING");
		cs3.setDuration(2);
		cs3.setFee(15000);
		
		Student st1 = new Student();
		st1.setName("Pavan");
		st1.setMobile("9561471782");
		st1.setEmail("pbajait@gmail.com");
		
		
		Student st2 = new Student();
		st2.setName("Pankaj");
		st2.setMobile("9850471782");
		st2.setEmail("pk@gmail.com");
		
		
		Student st3 = new Student();
		st3.setName("Aksh");
		st3.setMobile("9512341782");
		st3.setEmail("aksh@gmail.com");
		
		cs1.getStdList().add(st3);
		cs1.getStdList().add(st2);
		cs1.getStdList().add(st1);
		cs2.getStdList().add(st3);
		cs2.getStdList().add(st1);
		cs3.getStdList().add(st1);
		cs3.getStdList().add(st2);
		
		
		st1.getCrsList().add(cs3);
		st2.getCrsList().add(cs3);
		st3.getCrsList().add(cs2);
		st1.getCrsList().add(cs2);
		st1.getCrsList().add(cs1);
		st2.getCrsList().add(cs1);
		st2.getCrsList().add(cs1);
		
		em.getTransaction().begin();
		
		em.persist(cs1);
		em.persist(cs2);
		em.persist(cs3);
		
		
		em.getTransaction().commit();
		
		em.close();

		System.out.println("courses and students enrolled done...");
		
		
	}

}
