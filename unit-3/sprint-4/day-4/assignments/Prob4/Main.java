package assignments.Prob4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Enter an integer :");
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            int num = Integer.parseInt(str);
            long sq = num*num;
            System.out.println("The square value is : " + sq);
            System.out.println("The work has been done successfully");
        }
        catch(NumberFormatException nfe){
            System.out.println("Entered input is not a valid format for an integer.");
        }
    }
}
