package Prob2;
import java.util.*;

public class Student {
	Integer roll;
	String name;
	Integer marks;
    

    public Student(Integer roll, String name,Integer marks) {
    	this.roll = roll;
    	this.name = name;
        this.marks = marks;
        
    }

    @Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
}

class StudentMarksComp implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		if(s1.marks > s2.marks)
			return +1;
		else if(s1.marks < s2.marks)
			return -1;
		else
			return 0;
	}
}

class Main {
	public static void main(String[] args) {
		
		TreeMap<Student,String> tm = new TreeMap<>(new StudentMarksComp());
		
			tm.put(new Student(10,"Ganesh",950),"Maharastra");
			tm.put(new Student(12,"Surya",850),"Tamilnadu");
			tm.put(new Student(15,"Venkat",920),"Telangana");
			tm.put(new Student(16,"Dinesh",910),"Haryana");
			tm.put(new Student(18,"Srinu",880),"Kerla");
			
		Set<Map.Entry<Student,String>> set= tm.entrySet();
		
		for(Map.Entry<Student,String> me: set) {
			System.out.println("Student of State :" + me.getValue());
//			Student student1 = me.getKey();
//			System.out.println("Roll :" + student1.roll);
//			System.out.println("Name :" + student1.name);
//			System.out.println("Marks :" + student1.marks);
			System.out.println("*********************************"+"\n");
		}
	}
}

