package Prob2;

import java.util.Scanner;
import java.util.TreeSet;

public class Employee implements Comparable<Employee>{
    int empId;
    String empName;
    double salary;

    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }
    @Override
    public int compareTo(Employee e) {
        return this.salary > e.salary ? +1 : -1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }
}


class Main{
    public static void main(String[] args) {

        TreeSet<Employee> employee = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++) {
            System.out.println("Enter the details of Employees" + (i + 1));
            System.out.println("Enter the Employee Id :");
            int empId= sc.nextInt();
            System.out.println("Enter the Employee Name :");
            String empName = sc.next();
            System.out.println("Enter the Salary of Employee :");
            double salary = sc.nextDouble();

            employee.add(new Employee(empId, empName, salary));

            System.out.println("==========================================");
        }
        System.out.println("****************************************");
        System.out.println("Employees details are :");
        for(Employee emp : employee){
            System.out.println(emp);
        }
    }
}