package com.pbajait;

public class Student {
	
	private int roll;
	private String name;
	private int marks;
	
	
	//parameterized constructor
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	//toString()
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
