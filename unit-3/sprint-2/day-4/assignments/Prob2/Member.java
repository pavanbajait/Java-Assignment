package assignments.Prob2;

public class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    public void printSalary(int salary){
        System.out.println(salary);
    }

    public Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class Employee extends Member {
    String specialisation;
    String department;

    public Employee(String name, int age, String phoneNumber, String address, double salary) {
        super(name, age, phoneNumber, address, salary);
    }
}

class Manager extends Member {
    String specialisation;
    String department;

    public Manager(String name, int age, String phoneNumber, String address, double salary) {
        super(name, age, phoneNumber, address, salary);
    }
}

class Main {
    public static void main(String[] args) {
        Member emp = new Employee("Pavan", 25, "9561471782", "Hinganghat", 15000.00);
        Member m1 = new Manager("PavanBajait", 26, "95614717825", "Hingang", 15500.00);

        System.out.println(emp);
        System.out.println(m1);
    }
}