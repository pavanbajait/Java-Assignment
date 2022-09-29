package com.pbajait.utility;

import javax.persistence.*;

public class EMUtil {
	
	private static EntityManagerFactory emf;
	
	static {
		emf = Persistence.createEntityManagerFactory("EmployeeUnit");
	}

	public static EntityManager provideEntityManager() {
		return emf.createEntityManager();
	}
}
