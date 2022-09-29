package assignments.Prob3;

public class Person {
    String name;
    String gender;
    Address address;

//    public Person(String name, String gender, Address address) {
//        this.name = name;
//        this.gender = gender;
//        this.address = address;
//    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address=" + address +
                '}';
    }
}

class Address {
     String city;
     String state;
     String pinCode;

    public Address(String city, String state, String pinCode) {
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}
class Instructor extends Person {
    int instructorId;
    int salary;
    Address address;

    public Instructor(int instructorId, int salary, Address address) {
        this.instructorId = instructorId;
        this.salary = salary;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "instructorId=" + instructorId +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }
}

class Student extends Person{
    int studentId;
    String courseEnrolled;
    int courseFee;
    Address address;

    public Student(int studentId, String courseEnrolled, int courseFee, Address address) {
        this.studentId = studentId;
        this.courseEnrolled = courseEnrolled;
        this.courseFee = courseFee;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", courseEnrolled='" + courseEnrolled + '\'' +
                ", courseFee=" + courseFee +
                ", address=" + address +
                '}';
    }
}

class Main {
    public static Person generatePerson(Person person){
        return person;
    }

    public static void main(String[] args) {
        Address adr = new Address("Hinganghat",  "MH", "442301");
//        Person p = new Person("Hinganghat",  "MH", "442301");
        Person newStudent = generatePerson(new Student(123, "SAP", 25000, adr));

        Person newTeacher = generatePerson(new Instructor(420, 29000, adr));

        System.out.println(newStudent);
        System.out.println(newTeacher);


    }
}