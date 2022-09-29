package assignments.Prob3;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Student {
    int rollNo;
    String name;
    String address;
    int marks;

    public Student(int rollNo,String name,String address,int marks){
        this.rollNo=rollNo;
        this.name=name;
        this.address=address;
        this.marks=marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", marks=" + marks +
                '}';
    }
}

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Students:");
        int n = sc.nextInt();
        Student [] arr = new Student[n];
        int Avg=0;
        System.out.println("-----------------------------------------------------------------------------");

        for(int i=0;i<n;i++){
            System.out.println("Enter Details of Student"+ (i+1));
            System.out.println("Enter student roll number:");
            int rollNo = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter student name:");
            String name = sc.nextLine();
            System.out.println("Enter student address:");
            String address = sc.nextLine();
            System.out.println("Enter student marks:");
            int marks = sc.nextInt();
            Avg+=marks;
            arr[i] = new Student(rollNo, name, address, marks);

            System.out.println("-----------------------------------------------------------------------------");

        }

        System.out.println("Student Details: ");
        System.out.println("-----------------------------------------------------------------------------");
        for( Object o: arr){
            System.out.println(o);
        }
        System.out.println("-----------------------------------------------------------------------------");

        System.out.println("Avg marks of all Students:" + (double)Avg/n);
        System.out.println("-----------------------------------------------------------------------------");

//        System.out.println(Arrays.toString(arr));
    }
}