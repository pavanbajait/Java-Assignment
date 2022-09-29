package Prob1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Students: ");
        int n =sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.println("===========================================");
            System.out.println("Enter the Roll Number :");
            int rollNo=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the Name :");
            String studentName =sc.nextLine();
            System.out.println("Enter the Marks: ");
            int marks=sc.nextInt();
            System.out.println("===========================================");
            Student s =new Student(rollNo, studentName, marks);

            System.out.println("Students Details: "+i);
            System.out.println("Student Roll No: "+s.rollNo);
            System.out.println("Student Name: "+ s.studentName);
            System.out.println("Students Marks: "+ s.marks);
            System.out.println("============================================");

        }
    }
}
