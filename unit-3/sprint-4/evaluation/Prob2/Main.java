package Prob2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of elements in the array: ");
            int size = sc.nextInt();
            sc.nextLine();
            int[] arr = new int[size];
            System.out.println("Enter the elements in the array : ");
            for (int i = 0; i < size; i++) {
                String s = sc.nextLine();
                arr[i] = Integer.parseInt(s);
            }
            System.out.println("Enter the index of the array element you want to access : ");
            String s = sc.nextLine();
            int index = Integer.parseInt(s);
            System.out.println("The array element at index " + index +" = "+ arr[index]);
//            System.out.println();
            System.out.println("The array element successfully accessed");
        }
        catch(ArrayIndexOutOfBoundsException aib){
            System.out.println(aib);
        }
        catch(NumberFormatException nfe){
            System.out.println(nfe);
        }
    }
}
