package com.pbajait.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.FetchType;

public class Customer {
	
	
	
	@Embedded
	@ElementCollection(fetch=FetchType.EAGER)
	private Set<Address> empAddress = new HashSet();

}
