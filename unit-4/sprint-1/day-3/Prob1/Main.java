package Prob1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(30,"Name1",350));
		students.add(new Student(32,"Name2",150));
		students.add(new Student(13,"Name3",400));
		students.add(new Student(14,"Name4",200));
		students.add(new Student(5,"Name5",450));
		
		Collections.sort(students, (s1,s2) -> s1.rollNo > s2.rollNo ? +1 : -1 );

		students.stream()
		.filter(s -> s.marks < 250)
		.forEach(s -> System.out.println(s));
	}

}
