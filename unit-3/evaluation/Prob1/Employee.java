package Prob1;

public abstract class Employee {
    protected int employeeId;
    protected String employeeName;
    protected double salary;

    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    abstract void calculateSalary();
}

class PermanentEmployee extends Employee{
    private double basicPay;

    public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
        super(employeeId, employeeName);
        this.basicPay = basicPay;
    }

    @Override
    public void calculateSalary(){
        double x =(this.basicPay-this.basicPay * 0.12) ;
        super.salary =x;
    }

    @Override
    public String toString() {
        return "PermanentEmployee{" +
                "basicPay=" + basicPay +
                ", employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class TemporaryEmployee extends Employee{
    private int hoursWorked;
    private int hourlyWages;

    public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages) {
        super(employeeId, employeeName);
        this.hoursWorked = hoursWorked;
        this.hourlyWages = hourlyWages;
    }

    @Override
    public void calculateSalary(){
        super.salary = this.hoursWorked * this.hourlyWages;
    }


}

class Loan {
    public double calculateLoanAmount(Employee employeeObj){
        if(employeeObj instanceof PermanentEmployee){
            return (15 * employeeObj.salary / 100);
        } else if (employeeObj instanceof TemporaryEmployee) {
            return (10 * employeeObj.salary / 100);
        }
        return (10 * employeeObj.salary / 100);
    }

    private Loan() {
    }
    public static Loan getObject(){
        Loan loan = new Loan();
        return loan;
    }
}

class Main{
    public static void main(String[] args) {
        Loan loan = Loan.getObject();
        Employee obj1 = new PermanentEmployee(1,"Name1",1000);
        obj1.calculateSalary();
        Employee obj2 = new TemporaryEmployee(2,"Name2",20,100);
        obj2.calculateSalary();
        double permanentEmployeeLoan=loan.calculateLoanAmount(obj1);
        double temporaryEmployeeLoan=loan.calculateLoanAmount(obj2);
//        System.out.println(new PermanentEmployee(1,"Name1",1000));

        System.out.println("Loan Amount for Permanent Employee => "+permanentEmployeeLoan);
        System.out.println("Loan Amount for Temporary Employee => "+temporaryEmployeeLoan);
    }
}