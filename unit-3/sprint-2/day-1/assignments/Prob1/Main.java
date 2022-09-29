package assignments.Prob1;

public class Main {
    public static void main(String[] args) {
        Student s2 = new Student();
        Student s1 = new Student(25, "Pavan", 25, 60);

        s2.setRoll(26);
        s2.setName("Pankaj");
        s2.setAge(17);
        s2.setMarks(501);

        System.out.println(s1);
        System.out.println(s2);

    }
}
