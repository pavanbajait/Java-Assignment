package assignments.Prob3;

public class Student {
    static Student obj;
    int roll;
    String name;
    String address;
    String clgName;

    public Student(int roll, String name, String address) {
        this.roll = roll;
        this.name = name;
        this.address = address;
    }
    public Student(int roll, String name, String address, String clgName) {
        this.roll = roll;
        this.name = name;
        this.address = address;
        this.clgName = clgName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", clgName='" + clgName + '\'' +
                '}';
    }

    public static Student getStudent(boolean isFromNIT){

          if(isFromNIT){
              obj = new Student(21, "Pavan", "Hinganghat");
              obj.clgName="NIT";
          }
          else{
              obj = new Student(24, "Pawan", "Hingangat", "JDIET");

          }
        return obj;
    }

}
