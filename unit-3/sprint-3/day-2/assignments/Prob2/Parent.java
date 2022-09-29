package assignments.Prob2;

import java.util.Scanner;

public class Parent {
    final int number;
    public Parent (int i){
        this.number=i;
    }
    public void method1(){
        System.out.println("Inside method 1 of Parent class");
        this.method4();
    }
    public final void method2(){
        System.out.println("Inside method 2 of Parent class");

    }
    public void method3(){
        this.method2();
        System.out.println("Inside method 3 of Parent class");

    }
    public void method4(){
        this.method3();
        System.out.println("Inside method 4 of Parent class");
    }

}

class Child extends Parent {
    public Child(int num) {
        super(num);
    }

    @Override
    public void method1(){

        System.out.println(super.number);
        super.method1();
        System.out.println("Inside method 1 of child class");

    }

    public static void main(String[] args) {

        System.out.println("Enter the number from 1 to 10");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>10 || num<0){
            System.out.println("Invalid number");
        }else{
            Child c =new Child(num);
            c.method1();
        }
        

    }

}