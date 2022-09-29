package com.pbajait;

import org.springframework.stereotype.Service;

@Service
public class Car implements Vehicle {
	
	public void start() {
		
		System.out.println("Car started...");
		
	}
	
	

	public void go() {
		start();
		System.out.println("vehicle car  started...");
	}
		
}
