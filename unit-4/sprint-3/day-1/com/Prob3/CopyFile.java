package com.Prob3;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        System.out.println("Enter the file name :");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try {
            String file = br.readLine();
            BufferedReader br2 = new BufferedReader(new FileReader(file));
            PrintWriter pr = new PrintWriter("newfile.txt");
            String line=br2.readLine();
            while(line != null){
                pr.println(line.toUpperCase());
                line=br2.readLine();
            }
            pr.flush();
            pr.close();
            br2.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
