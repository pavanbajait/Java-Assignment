package assignments.Prob1;
import java.util.Scanner;

public class Main {
    static String originalString;
    public static String reversString(String input){
        //write the logic
        char [] arr= new char[input.length()];
        for (int i=0;i<input.length();i++) {
            arr[i] = input.charAt(input.length()-i-1);
        }
//        return  String.copyValueOf(arr);
        String rev= "";
        for(char c : arr){
            rev+=c;
        }
        return rev;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to reverse");
        String originalString = sc.next();
        String result = reversString(originalString);
        System.out.println("Original String is :"+ originalString);
        System.out.println("Reversed String is :"+ result);
    }
}
