package com.pbajait.usecases;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.pbajait.model.SalariedEmployee;
import com.pbajait.utility.DBUtil;

public class Demo1 {

	public static void main(String[] args) {

		EntityManager em = DBUtil.provideEntityManager();

		String jpql = "from SalariedEmployee";
		
		Query q = em.createQuery(jpql);
		
		List<SalariedEmployee> sempls = q.getResultList();
		
		for(SalariedEmployee elemp : sempls) {
			
			System.out.println(elemp);
			
		}
	}

}
