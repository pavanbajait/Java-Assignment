package com.pbajait;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {

//		application container is activated
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Collage cl = ctx.getBean("clg", Collage.class);
		
		cl.showDetails();
		
	}

}
