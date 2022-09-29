package com.pbajait.usecases;

import java.util.List;

import javax.persistence.EntityManager;

import com.pbajait.model.Course;
import com.pbajait.model.Student;
import com.pbajait.utility.EMUtil;

public class Demo3 {

	public static void main(String[] args) {
		
		EntityManager em=EMUtil.provideEntityManager();

		List<Course> csList = em.find(Student.class, 3).getCrsList();
		
		System.out.println(csList);

		
	}

}
