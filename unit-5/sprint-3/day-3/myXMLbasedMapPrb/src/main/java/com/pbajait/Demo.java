package com.pbajait;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	private Map<Department, Employee> theMap;
	
	//use setter injection to inject theMap;
	public void setTheMap(Map<Department, Employee> theMap) {
		this.theMap = theMap;
	}
	
	
	public Demo() {
		
	}


	public void myInit(){
		System.out.println("inside myInit method");
	}
	
	public void cleanUp(){
		System.out.println("inside cleanUp method");
	}
	
	public void showDetails(){
		System.out.println("inside showDetails of Demo class");
		//print all the details of all the employees department-wise.
		System.out.println(theMap);
	}
	
	public static void main(String[] args) {
		//activate the spring container by locating the spring configuration file..
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Demo dem = ctx.getBean("demo",Demo.class);
		
		dem.showDetails();
		
		
		ClassPathXmlApplicationContext ctx2 = (ClassPathXmlApplicationContext)ctx;
		
		ctx2.close();
	}
	

}
