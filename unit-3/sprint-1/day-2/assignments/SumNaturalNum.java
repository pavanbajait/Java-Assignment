//Write a Java class with a static method that will take a number as a parameter, and print the sum of the natural number from 1 to the number supplied as the method argument.
package com.masai.assignment;

public class SumNaturalNum {
    public static void sumOfNaturalNum(int num){
        int res = num * (num + 1)/2;
        System.out.println(res);
    }
    public static void main(String[] args) {
        SumNaturalNum.sumOfNaturalNum(15);
    }
}
