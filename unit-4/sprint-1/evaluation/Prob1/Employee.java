package Prob1;
import java.util.Comparator;
public class Employee implements Comparable<Employee> {
    private int empId;
    private String name;
    private String address;

    public Employee(){

    }

    public Employee(int empId, String name, String address) {
        this.empId = empId;
        this.name = name;
        this.address = address;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }



    @Override
    public int compareTo(Employee o) {
        return this.getName().compareTo(o.getName());
    }
}
