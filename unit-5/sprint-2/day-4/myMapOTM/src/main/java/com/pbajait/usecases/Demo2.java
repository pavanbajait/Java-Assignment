package com.pbajait.usecases;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.pbajait.model.Course;
import com.pbajait.model.Student;
import com.pbajait.utility.EMUtil;

public class Demo2 {
	
	public static void main(String[] args) {
		
		EntityManager em=EMUtil.provideEntityManager();

//		Course cor = ;
		
		List<Student> stdList = em.find(Course.class, 1).getStdList();
		
		System.out.println(stdList);
		
//		String jpql= "select stdList from Course where CourseId = ?1";
//		
//		Query q = em.createQuery(jpql);
//		q.setParameter(1, 2);
//		
//		List<Student> stdList = q.getResultList();
//		
//		System.out.println(stdList);
		
	}

}
