package com.pbajait;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;


@Configuration
@ComponentScan(basePackages = "com.pbajait")
@PropertySource("App.properties")
public class AppConfig {
	
	
	@Autowired
	private Environment env;
	
	@Bean(name="clist")
	public List<String> getCities(){
		List<String> cities = new ArrayList<String>();
		cities.add(env.getProperty("city1"));
		cities.add(env.getProperty("city2"));
		cities.add(env.getProperty("city3"));
		cities.add(env.getProperty("city4"));
		return cities;
	}
	
	@Bean(name="students")
	public List<Student> getStudent(){
		List<Student> std = new ArrayList<Student>();
		
		std.add(new Student(1,"pavan",40));
		std.add(new Student(2,"shubham",50));
		std.add(new Student(3,"pankaj",45));
		std.add(new Student(4,"akash",40));
		std.add(new Student(5,"vipul",35));
		
		return std;
	}
	
	

}
