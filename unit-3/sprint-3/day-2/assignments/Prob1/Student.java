package assignments.Prob1;
import java.util.Scanner;
public class Student {
    private int roll;
    private String name;
    private int marks;
    private char grade;

    public Student(){

    }
    public Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", grade=" + grade +
                '}';
    }

    public void displayDetails() {
        //Using scanner class take input from the user and create student object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Students:");
        int n = sc.nextInt();
        Student[] arr = new Student[n];

        System.out.println("-----------------------------------------------------------------------------");

        for(int i=0;i<n;i++) {
            System.out.println("Enter Details of Student" + (i + 1));
            System.out.println("Enter student roll number:");
            int rollNo = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter student name:");
            String name = sc.nextLine();
            System.out.println("Enter student marks:");
            int marks = sc.nextInt();

            Student s = new Student(1, "Pavan", 20);
//            System.out.println(s);
            s.grade = s.calculateGrade(marks);
            System.out.println(s);
//            arr[i] = s;
            System.out.println("-----------------------------------------------------------------------------");
        }
    }
    private char calculateGrade(int marks) {
       if(marks>=500){
           return 'A';
       }else if(marks<500 && marks>=400){
           return 'B';
       }else{
           return 'C';
       }
    }
}

class Demo {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.displayDetails();
    }
}
