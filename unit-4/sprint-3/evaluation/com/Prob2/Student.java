package com.Prob2;

public class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;
    private String student_email;
    transient private String studentPassword;

    public Student( ) {

    }

    public Student(int studentId, String studentName, String studentAddress, String student_email, String studentPassword) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.student_email = student_email;
        this.studentPassword = studentPassword;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", student_email='" + student_email + '\'' +
                ", studentPassword='" + studentPassword + '\'' +
                '}';
    }
}

class StudentDB{
    Student studentsData;
    void addStudent(Student student){

    }
}