package com.Prob3;

import java.io.*;

public class CharCount {
    public static void main(String[] args) throws IOException {

        FileWriter file = new FileWriter("abcx.txt");
//        file.createNewFile();
        file.write("rameshrjhgr\n");
        file.write("fvsgjryhe\n");
        file.write("rrrshr\n");
        file.flush();
        file.close();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the file name:");
        String name = null;
        String ch = null;
        try {
            name = br.readLine();
            System.out.println("Enter the character to be counted :");
            ch = br.readLine();
        } catch (IOException e) {
            System.out.println("Throws IOException , Enter the proper details");
        }
//        System.out.println(name);
        char chr = ch.charAt(0);
        BufferedReader br2;
        int count=0;
        try {
            br2 = new BufferedReader(new FileReader(name));

           String c = br2.readLine();
//            System.out.println(c);
            while( c != null){
//                System.out.println(c);
                for(int i=0;i<c.length();i++){
                    if(chr==(c.charAt(i))){
                        count++;
                    }
                }

                c = br2.readLine();
            }
            br2.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(count);


    }
}
