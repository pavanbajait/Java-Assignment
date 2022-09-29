//Write a Java class with a static method that will take 5 positive numbers as a parameter which will represent: 1s, 2s, 3s, fours and sixes scored by the batsman.

package com.masai.assignment;

public class CricketScore {
    public static void getRuns(int ones, int twos, int threes, int fours, int sixes){
        int totalRun = ones + 2 * twos + 3 * threes + 4 * fours + 6* sixes;
        System.out.println("Total Runs Scored by the batsman is : "+totalRun);
    }
    public static void main(String[] args) {
        CricketScore.getRuns(10,8,4,6,5);
//        SumNaturalNum.sumOfNaturalNum(15);
    }
}
