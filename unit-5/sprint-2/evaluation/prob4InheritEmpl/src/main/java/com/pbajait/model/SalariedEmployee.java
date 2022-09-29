package com.pbajait.model;

import javax.persistence.Entity;

@Entity
public class SalariedEmployee extends Employee{

	private int salary;
	private String email;
	
	public SalariedEmployee() {
		
	}

	public SalariedEmployee(int salary, String email) {
		super();
		this.salary = salary;
		this.email = email;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [salary=" + salary + ", email=" + email + ", getEmpId()=" + getEmpId()
				+ ", getEmpName()=" + getEmpName() + "]";
	}

	
	
}
