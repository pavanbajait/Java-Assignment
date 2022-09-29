package com.Prob2;

import java.io.*;

public class Employee implements Serializable{
    private String name;
    private String dob;
    private String department;
    private String designation;
    private long salary;

    public Employee(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", department='" + department + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class Main{
    public static void main(String[] args) throws Exception {
        Employee emp = new Employee();
        emp.setName("Pavan");
        emp.setDob("02-10-1997");
        emp.setDepartment("Electrical");
        emp.setDesignation("Engineer");
        emp.setSalary(15000);

        FileOutputStream fos=new FileOutputStream("OutObject.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(emp);
        FileInputStream fis=new FileInputStream("OutObject.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Object obj=ois.readObject();
        Employee e=(Employee)obj;
        System.out.println(e.getName());
        System.out.println(e.getDob());
        System.out.println(e.getDepartment());
        System.out.println(e.getDesignation());
        System.out.println(e.getSalary());
    }
}