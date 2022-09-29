package com.Prob4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {
    private int employeeId ;
    private String employeeName;
    private String employeeAddress;
    private double employeeSalary;
    private LocalDate joiningDate;

    public Employee( ) {

    }

    public Employee(int employeeId, String employeeName, String employeeAddress, double employeeSalary, LocalDate joiningDate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeeSalary = employeeSalary;
        this.joiningDate = joiningDate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeAddress='" + employeeAddress + '\'' +
                ", employeeSalary=" + employeeSalary +
                ", joiningDate=" + joiningDate +
                '}';
    }
}


class Department{
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to add employee: (Y/N)");
        String wish = sc.next();
        boolean flag= false;
        if(wish.equalsIgnoreCase("Y")){
            flag = true;
        }
        int count=1;

            while (flag) {
                try {
                System.out.println("Enter the details for: " + count + " Employee");
                System.out.println("Enter the Employee Id:");
                int employeeId = sc.nextInt();
                System.out.println("Enter the Employee Name:");
                String employeeName = sc.nextLine();
                sc.nextLine();
                System.out.println("Enter the Employee Address:");
                String employeeAddress = sc.nextLine();
                System.out.println("Enter the Employee Salary:");
                double employeeSalary = sc.nextDouble();
                System.out.println("Enter the Joining Date: Follow this format(dd/mm/yyyy)");
                String jdate = sc.next();
                LocalDate join = LocalDate.parse(jdate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                LocalDate date = LocalDate.now();
                long years = ChronoUnit.YEARS.between(join, date);
                if (years >= 5) {
                    employeeSalary += 5000;
                }
                Employee emp = new Employee(employeeId, employeeName, employeeAddress, employeeSalary, join);
                employeeList.add(emp);
                if (years >= 5) {
                    System.out.println("Employee added and Salary is increased by 5000");
                } else {
                    System.out.println("Employee added...............");
                }
                }catch(Exception e){
                    System.out.println("Please Pass Date in proper Format: (dd/mm/yyyy)");
                }
                System.out.println("Do you want to add more Emplyee? (Y/N)");
                String will = sc.next();
                if (will.equalsIgnoreCase("N")) {
                    flag = false;
                }else{
                    count++;
                }
            }
        System.out.println("Thank You......");
        System.out.println("Employee Details");
        for(Employee e: employeeList){
            System.out.println(e);
            System.out.println("--------------------------------------------------------");
        }
//        System.out.println(employeeList);

    }


}