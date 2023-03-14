package com.Prob2;

import java.util.*;

public class Employee{
    private int employeeId;
    private String employeeName;
    private String employeeAddress;
    private double employeeSalary;

    public Employee(){

    }
    public Employee(int employeeId, String employeeName, String employeeAddress, double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeAddress='" + employeeAddress + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
    }

    public int compareTo(Employee o){
        if(o.employeeId)
    }

}
mn

class CollectEmp{
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(1,"pavan", "Hgt", 10000.00));
        emp.add(new Employee(2, "Ram", "pune", 12000.00));
        emp.add(new Employee(6, "Raghv", "mumbai", 15000.00));
        emp.add(new Employee(4, "Raja", "nagpur", 8000.00));
        emp.add(new Employee(3, "sam", "wardha", 16000.00));

//        Collections.sort(emp,(e1,e2) -> e1.e > e2.employeeSalary ? +1: -1);

        for(Employee e: emp){
            System.out.println(e);
        }
    }
}
`