package com.pbajait.usecases;

import javax.persistence.EntityManager;

import com.pbajait.model.Collage;
import com.pbajait.model.Student;
import com.pbajait.utility.EMUtil;

public class InsertClgStd {

	public static void main(String[] args) {
		EntityManager em=EMUtil.provideEntityManager();
		
		Collage col = new Collage();
		col.setCollageName("JDIET");
		col.setCollageAddress("Yavatmal");
		
		Student st = new Student();
		st.setStudentName("Pavan");
		st.setMobileNumber("9561471782");
		st.setEmail("pbajait@gmail.com");
		st.setClg(col);
		
		Student st1 = new Student();
		st1.setStudentName("Shubham");
		st1.setMobileNumber("9850471782");
		st1.setEmail("sughade@gmail.com");
		st1.setClg(col);
		
		col.getStd().add(st);
		col.getStd().add(st1);
		
		em.getTransaction().begin();
		
		em.persist(col);
		
		em.getTransaction().commit();	
		
		System.out.println("Collage & Student details inserted successfully...");
	}

}
