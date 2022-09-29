package com.Prob1;

import java.io.*;

public class Student implements Serializable {
    transient private int roll;
    private String name;
    private Address address;

    public Student(int roll, String name, Address address) {
        this.roll = roll;
        this.name = name;
        this.address = address;
    }

    public Student() {

    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}


class Main{
    public static void main(String[] args) throws Exception {
        Address adr = new Address("Maharashtra", "Hinganghat", "442301");
        Student st = new Student(02, "Pavan", adr);
        FileOutputStream fos=new FileOutputStream("student.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(st);
        oos.flush();
        oos.close();
        System.out.println("Serialization done of Student Object");
        FileInputStream fis = new FileInputStream("student.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();
        Student std = (Student)obj;
        System.out.println(std);
        ois.close();
        System.out.println("Deserilization done successfully");
    }
}