package com.pbajait;

import org.springframework.stereotype.Service;

@Service
public class Bike implements Vehicle{
	
	public void ride() {
		
		System.out.println("ride started....");
		
	}

	public void go() {
		ride();
		System.out.println("Bike Vehicle started...");

		
	}
}
