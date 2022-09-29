package com.pbajait;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class A {

	@Autowired
	List<String> clist;
	
	@Autowired
	List<Student> students; 
	
	public void fun() {
		System.out.println(clist);
		System.out.println(students);
	}
	
	@PostConstruct
	public void setUp() {
		System.out.println("inside set up method");
	}
	
	@PreDestroy
	public void tearDown(){
		System.out.println("inside tear down method");
	}
	
}
