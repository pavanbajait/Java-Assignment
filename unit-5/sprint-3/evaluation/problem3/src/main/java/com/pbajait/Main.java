package com.pbajait;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DrawShapes dr = ctx.getBean("d", DrawShapes.class);
		
		dr.start();
		
	}

}
