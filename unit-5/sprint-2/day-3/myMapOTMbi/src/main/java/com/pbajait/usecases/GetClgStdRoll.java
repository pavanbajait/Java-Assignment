package com.pbajait.usecases;

import java.util.List;

import javax.persistence.EntityManager;

import com.pbajait.model.Collage;
import com.pbajait.model.Student;
import com.pbajait.utility.EMUtil;

public class GetClgStdRoll {

	public static void main(String[] args) {

		EntityManager em=EMUtil.provideEntityManager();

		Student std = em.find(Student.class, 1);
		
		
		System.out.println(std.getClg());
		
	}

}
