package com.Prob4;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2;
        try {
            System.out.println("Enter the input file name:");
            String input = br.readLine();
            System.out.println("Enter the output file name");
            String op = br.readLine();
            br2 = new BufferedReader(new BufferedReader(new FileReader(input)));
            PrintWriter pr = new PrintWriter(op);
            String line=br2.readLine();
            while(line != null){
//                System.out.println(line);
                pr.println(line);
                line=br2.readLine();
            }
            pr.flush();
            pr.close();
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
