package com.Prob1;

import java.io.*;

public class Student {
    public static void main(String[] args) {
        PrintWriter pr = null;
        try {
            pr = new PrintWriter("student.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        pr.println("Ram");
        pr.println(68);
        pr.println(74);
        pr.println(59);
        pr.println(88);
        pr.println(65);
        pr.println("Sam");
        pr.println(86);
        pr.println(46);
        pr.println(23);
        pr.println(15);
        pr.println(96);
        pr.flush();
        pr.close();
        try {
            BufferedReader br = new BufferedReader(new FileReader("student.txt"));
            PrintWriter pr2 = new PrintWriter("reportCard.txt");
//            pr2.print("x");
            String line = br.readLine();

            while(line != null){
                int sum = 0;
                 String name = line;
                 line = br.readLine();
                 for(int i=0;i<5;i++) {
                     sum += Integer.parseInt(line);
                     line = br.readLine();
                 }
                 pr2.print(name);
                pr2.print(" total marks = ");
                pr2.print(sum);
                pr2.print(" and Average = ");
                pr2.println((sum/5));
                System.out.println(name+" total mark = "+sum+" and average is "+sum/5);
            }
            pr2.flush();;
            pr2.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
