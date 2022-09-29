package com.pbajait;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
@Service
public class Demo2 {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		Travel obj = ctx.getBean("travel", Travel.class);
		Vehicle xyz = new Car();
		obj.setVeh(xyz);
		obj.journey();
		
	}

}
