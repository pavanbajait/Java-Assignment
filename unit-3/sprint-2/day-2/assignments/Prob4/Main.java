package assignments.Prob4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        System.out.println("Enter the character position you want to access:");
        int i = sc.nextInt();
        char ch = s.charAt(i);

        System.out.println("Character at position " +i +" is :");
        System.out.println(ch);
    }
}
