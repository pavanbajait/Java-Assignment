package assignments.Prob4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

interface Intr {
        int[] display(int p);
}

class Test implements Intr {
    @Override
    public int[] display(int p){
        int count=0;
        for(int i=2;i<=p;i++){
            if(i==2 || i==3) {
                count++;
                continue;
            }
            boolean flag=false;
            for(int j=2;j<=Math.sqrt(p);j++){
                if(i%j==0){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                count++;
            }
        }
        int[] array = new int[count];
        int count1=0;
        for(int k=2;k<=p;k++){
            if(k==2 || k==3) {
                array[count1]=k;
                count1++;
                continue;
            }
            boolean flagx=false;
            for(int l=2;l<=Math.sqrt(p);l++){
                if(k%l==0){
                    flagx=true;
                    break;
                }
            }
            if(!flagx){
                array[count1]=k;
                count1++;
            }
        }
        return array;
    }
}


class Main5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int p = sc.nextInt();
        Test t=new Test();
        //Take this argument from user using the Scanner class
        //Write the logic to print the elements
        int[] arr= t.display(p);
        System.out.println(Arrays.toString(arr));
    }
}