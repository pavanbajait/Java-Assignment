package com.pbajait;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

public static void main(String[] args) {
		
		
		ApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeService obj = ctx.getBean("employeeService",EmployeeService.class);
		obj.printAppName();
		obj.printList();
		obj.printMap();
		
		AnnotationConfigApplicationContext x = (AnnotationConfigApplicationContext)ctx;
		
		x.close();

	}
	
}
