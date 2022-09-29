package com.Prob1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileReader {
    public static void main(String[] args) throws IOException {
//        try {
//            File file = new File("D:\\File\\abc.txt");
//            if (file.createNewFile()) {
//                System.out.println("New File is created!");
//            } else {
//                System.out.println("File already exists.");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        FileWriter fw = new FileWriter("D:\\File\\bc.txt");
        fw.write(100);//d will be added
        fw.write("ramesh\nwelcome");
        fw.write("\n");
        fw.write("india");
        fw.write("\n");
        char ch[]={'a','b','c'};
        fw.write(ch);
        fw.flush();
        fw.close();

        FileReader fr=new FileReader("D:\\File\\bc.txt");
        int i=fr.read();
        while( i != -1) {
            System.out.print((char) i);
            i = fr.read();
        }
    }
}
