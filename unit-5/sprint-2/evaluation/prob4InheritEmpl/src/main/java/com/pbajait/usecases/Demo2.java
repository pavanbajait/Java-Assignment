package com.pbajait.usecases;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.pbajait.model.ConractualEmployee;
import com.pbajait.utility.DBUtil;

public class Demo2 {

	public static void main(String[] args) {
		EntityManager em = DBUtil.provideEntityManager();

		String jpql = "from ContractualEmployee";
		
		Query q = em.createQuery(jpql);
		
		List<ConractualEmployee> cempls = q.getResultList();
		
		for(ConractualEmployee elemp : cempls) {
			
			System.out.println(elemp);
			
		}

	}

}
