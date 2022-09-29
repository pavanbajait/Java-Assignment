package com.masai.assignment;

public class Student {
    int roll;
    String name;
    int marks;
    public void displayStudentsDisplay(){
        System.out.println("Roll is : "+roll);
        System.out.println("Name is : "+name);
        System.out.println("Marks is : "+marks);
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.roll= 15;
        student1.name= "Pavan";
        student1.marks= 95;
        student1.displayStudentsDisplay();

        System.out.println("\n==========="+"\n");

        Student student2 = new Student();
        student2.roll= 16;
        student2.name= "Shubham";
        student2.marks= 99;
        student2.displayStudentsDisplay();

        student2 = student1;
    }
}
