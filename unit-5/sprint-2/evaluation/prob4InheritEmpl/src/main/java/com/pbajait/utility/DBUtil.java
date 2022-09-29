package com.pbajait.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
	private static EntityManagerFactory emf;
	
	static {
		emf = Persistence.createEntityManagerFactory("EmployeeInheritUnit");
	}

	public static EntityManager provideEntityManager() {
		return emf.createEntityManager();
	}
}
