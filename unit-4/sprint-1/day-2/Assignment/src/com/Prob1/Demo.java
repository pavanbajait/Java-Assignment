package com.Prob1;

public class Demo {
	
	public static void main(String[] args) {
		myGeneric<Integer> myGen1 = new myGeneric<>();	
		myGen1.add(10);
		System.out.println(myGen1.get());
		
		myGeneric<Character> myGen2 = new myGeneric<>();
		myGen2.add('a');
		System.out.println(myGen2.get());
		
		myGeneric<Student> myGen3 = new myGeneric<>();
		myGen3.add(new Student(12, "pavan"));
		System.out.println(myGen3.get().name);
		
		System.out.println("Elements of Integer Array:");
		Integer [] arr = {1, 2, 3, 4, 5};
		myGeneric<Integer> myGen4 = new myGeneric<>();
		myGen4.printArray(arr);
		
		System.out.println("Elements of Characater Array:");
		Character [] array = {'p', 'a', 'v', 'a', 'n'};
		myGeneric<Character> myGen5 = new myGeneric<>();
		myGen4.printArray(array);
	
	}

}

class myGeneric<E>{
	E obj;
	void add(E obj) {
		this.obj=obj;
	}
	E get() {
		return obj;
	}
	public static <E> void printArray(E[] elements) {
		for ( E element : elements){
			System.out.println(element );
		}
	}
}

class Student{
	int roll;
	String name;
	
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	
}