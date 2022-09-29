package Prob2;

import java.util.Scanner;
public enum Stadium {
    EDEN_GARDENS_STADIUM,WANKHEDE_STADIUM,CHIDAMBARAM_STADIUM,M_CHINNASWAMY_STADIUM
}
class IPL{
    void homeTeamStadium(Stadium stadium){
        switch (stadium){
            case EDEN_GARDENS_STADIUM:
                System.out.println("This is the home ground of KKR");
                break;
            case WANKHEDE_STADIUM:
                System.out.println("This is the home ground of Mumbai Indians");
                break;
            case CHIDAMBARAM_STADIUM:
                System.out.println("This is the home ground of CSK");
                break;
            case M_CHINNASWAMY_STADIUM:
                System.out.println("This is the home ground of RCB");
                break;
            default:
                System.out.println("Ivalid Homeground");
        }
    }
    public static void main(String[] args) {
        IPL obj = new IPL();
        System.out.println("Enter the Stadium Name:");
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        Stadium stadium= Stadium.valueOf(st.toUpperCase());
        obj.homeTeamStadium(stadium);
    }
}