package assignments.Prob2;
import java.util.Scanner;
public class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;
    private double netSalary;
//    Employee(){
//
//    }

    public Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public void calculateNetSalary(int pfPercentage){
        this.netSalary=salary-(salary*pfPercentage/100);
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", salary=" + salary +
                ", netSalary=" + netSalary +
                '}';
    }
}

class Main{
    public static Employee getEmployeeDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Id: ");
        int employeeId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Employee Name: ");
        String employeeName = sc.nextLine();
        System.out.println("Enter the Employee Salary: ");
        double salary = sc.nextDouble();
        return new Employee(employeeId, employeeName, salary);
    }
    public static int getPFPercentage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the PF Percentage:");
        int pfPercentage = sc.nextInt();
        return pfPercentage;
    }

    public static void main(String[] args) {
        Employee emp = getEmployeeDetails();
        int x = getPFPercentage();
//        Employee e = new Employee();
        emp.calculateNetSalary(x);
    }
}