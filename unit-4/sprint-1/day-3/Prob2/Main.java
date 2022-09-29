package Prob2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(30,"Pavan",850));
		students.add(new Student(32,"Amar",750));
		students.add(new Student(13,"Shubham",900));
		students.add(new Student(14,"Pankaj",600));
		students.add(new Student(5,"Akash",450));
		
		students.stream()
		.filter(s -> s.getMarks() < 800)
		.forEach(s -> System.out.println(s));
	}

}
