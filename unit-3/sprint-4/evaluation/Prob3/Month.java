package Prob3;
import java.util.Scanner;
public enum Month {
    JAN, FEB, MAR, APRIL, MAY, JUN, JULY, AUG, SEP, OCT, NOV, DEC;
}

class Demo {
    void showDetails(Month m){
        switch(m){
            case JAN:
                System.out.println("This is the 1st Month of the Year January.");
                break;
            case FEB:
                System.out.println("This is the 2nd Month of the Year February.");
                break;
            case MAR:
                System.out.println("This is the 3rd Month of the Year March.");
                break;
            case APRIL:
                System.out.println("This is the 4th Month of the Year April.");
                break;
            case MAY:
                System.out.println("This is the 5th Month of the Year May.");
                break;
            case JUN:
                System.out.println("This is the 6th Month of the Year June.");
                break;
            case JULY:
                System.out.println("This is the 7th Month of the Year July.");
                break;
            case AUG:
                System.out.println("This is the 8th Month of the Year Augast.");
                break;
            case SEP:
                System.out.println("This is the 9th Month of the Year September.");
                break;
            case OCT:
                System.out.println("This is the 10th Month of the Year Octomber.");
                break;
            case NOV:
                System.out.println("This is the 11th Month of the Year November.");
                break;
            case DEC:
                System.out.println("This is the 12th Month of the Year December.");
                break;
//            default:
//                System.out.println("Invalid Month Name");
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("Enter the month Name:");
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            Demo obj = new Demo();
            Month month = Month.valueOf(str.toUpperCase());
            obj.showDetails(month);
        }
        catch(Exception exc){
            System.out.println("Invalid Month Name.");
        }
    }

}
