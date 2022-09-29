package com.Prob3;
    import java.util.ArrayList;
    import java.util.List;
    import java.util.TreeSet;

public class Students implements Comparable<Students> {
    private int rollNo;
    private String Name;
    private int marks;

    public Students() {
    }

    public Students(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        Name = name;
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        rollNo = rollNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Students{" +
                "RollNo=" + rollNo +
                ", Name='" + Name + '\'' +
                ", marks=" + marks +
                '}';
    }
    @Override
    public int compareTo(Students student) {
        if(this.rollNo > student.rollNo)
            return +1;
        else if(this.rollNo < student.rollNo)
            return -1;
        else
            return 0;
    }
}

class Main {
    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();
        students.add(new Students(15, "Ramesh", 195));
        students.add(new Students(4, "Suresh", 330));
        students.add(new Students(1, "Nitesh", 210));
        students.add(new Students(6, "Mangesh", 200));
        students.add(new Students(2, "Shailesh", 152));

        TreeSet<Students> stdnt = new TreeSet<Students>(students);
        stdnt.stream()
                .filter(std -> std.getMarks() < 250)
                .forEach(std -> System.out.println(std));
    }
}