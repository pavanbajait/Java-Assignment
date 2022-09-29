package assignments.Prob1;

import java.util.Scanner;

public abstract class Student {
    String name;
    String address;
    int per;

    abstract int getPercentage();
    Student(){

    }
//    public Student(String name, String address, int per) {
//        this.name = name;
//        this.address = address;
//        this.per = per;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", Percentage=" + per +
                '}';
    }
}

class ScienceStudent extends Student {
    int physicsMarks;
    int chemistryMarks;
    int mathsMarks;

    ScienceStudent(){

    }

//    public ScienceStudent(String name, String address, int per) {
//        super(name, address, per);
//    }

    @Override
    int getPercentage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Physics marks:");
        this.physicsMarks=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Chemistry marks:");
        this.chemistryMarks=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Maths marks:");
        this.mathsMarks=sc.nextInt();
        int per = (physicsMarks+chemistryMarks+mathsMarks)/3;
        return per;
    }
}

class HistoryStudent extends Student {
    int historyMarks;
    int civicsMarks;
    HistoryStudent(){

    }
//    public HistoryStudent(String name, String address, int per) {
//        super(name, address, per);
//    }

    @Override
    int getPercentage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the History marks:");
        this.historyMarks=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the civics marks:");
        this.civicsMarks=sc.nextInt();
        int per = (historyMarks+civicsMarks)/2;
        return per;
    }
}
class AllStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student name:");
        String name = sc.nextLine();
        System.out.println("Enter the Student address:");
        String address = sc.nextLine();
        Student s1 = new HistoryStudent();
        s1.name = name;
        s1.address= address;
        s1.per= s1.getPercentage();
        System.out.println(s1);
        Student s2 = new ScienceStudent();
        s2.name=name;
        s2.address=address;
        s2.per=s2.getPercentage();
        System.out.println(s2);
//        res+= s2.getPercentage();
//        res/=2;
//        Student s3 = new ScienceStudent(name, address, res);
//        System.out.println(s3);
//      System.out.println(s2);
    }
}