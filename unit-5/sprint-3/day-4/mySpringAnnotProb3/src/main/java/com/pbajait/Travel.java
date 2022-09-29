package com.pbajait;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service(value="travel")
@Scope("prototype")
public class Travel {
	
	
	private Vehicle veh;
	
	public void journey() {
		veh.go();
		System.out.println("Jounrney started...");
	}
	
	
	
	@PostConstruct
	public void setUp() {
		System.out.println("inside set up method");
	}
	
	public Vehicle getVeh() {
		return veh;
	}
	
	@Autowired
//	@Qualifier(value = "veh")
	public void setVeh(Vehicle veh) {
		this.veh = veh;
	}

	@PreDestroy
	public void tearDown(){
		System.out.println("inside tear down method");
	}

}
