package assignments.Prob2;

public class Demo {

    public Demo() {
        this("Pavan");
        System.out.println("Inside empty Demo Constructor");
    }
    public Demo(String s) {
        this(24);
        System.out.println("Inside empty Demo String Constructor");
    }
    public Demo(int i) {
        this(2.6f);
        System.out.println("Inside empty Demo Integer Constructor");
    }
    public Demo(float f) {
        System.out.println("Inside empty Demo Float Constructor");
    }

    public static void main(String[] args) {
        Demo obj = new Demo();

    }
}
