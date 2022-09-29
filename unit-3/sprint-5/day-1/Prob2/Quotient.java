package Prob2;

import java.util.Scanner;

public class Quotient {
    public static void devide(int a , int b){
        try {
            int res = a / b;
            System.out.println("The Qoutient of " + a + "/" + b + " = " + res);
        } catch (ArithmeticException ae){
            System.out.println("DivideByZeroException caught");
        }finally {
            System.out.println("Inside finally block");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        devide(a, b);
    }
}
