package Prob3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(30,"Pavan",850));
		students.add(new Student(32,"Amar",750));
		students.add(new Student(13,"Shubham",900));
		students.add(new Student(14,"Pankaj",600));
		students.add(new Student(5,"Akash",450));
		
		Stream<Student> st=students.stream();
				
		List<Employee> emp = st.map(s -> new Employee(s.getRollNo(), s.getName(), s.getMarks()*1000)).collect(Collectors.toList());
		
		emp.stream().forEach(s -> System.out.println(s));
	}
}
