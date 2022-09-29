package com.pbajait.usecases;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.pbajait.model.Collage;
import com.pbajait.model.Student;
import com.pbajait.utility.EMUtil;

public class GetStdByClgId {

	public static void main(String[] args) {
		EntityManager em=EMUtil.provideEntityManager();
		
//		First approach with jpql-->

//		String jpql = "from Student where clg_collageId = ?1";
//		
//		Query q = em.createQuery(jpql);
//		
//		q.setParameter(1, 1);
		
//		List<Student> ls=q.getResultList();
		
//		Second approach by .find method-->
		
		Collage cl = em.find(Collage.class, 1);
		
		List<Student> ls=cl.getStd();
		
		ls.forEach(s -> System.out.println(s));
	}

}
