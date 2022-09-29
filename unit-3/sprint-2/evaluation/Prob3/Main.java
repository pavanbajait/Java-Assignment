package Prob3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of bookings:");
        int tc= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the available tickets:");
        Tickit.availableTickets = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<tc;i++){
//            if(i==0){
//                System.out.println("Enter the available tickets:");
//                int availableTickets = sc.nextInt();
//            }else{
//
//            }
            Tickit t =new Tickit();
            System.out.println("Enter the ticketid:");
            t.ticketid= sc.nextInt();
            System.out.println("Enter the price:");
            t.price = sc.nextInt();
            System.out.println("Enter the no of tickets:");
            int nooftickits= sc.nextInt();

            System.out.println("Available tickets:"+Tickit.availableTickets);
            int x=t.calculateTicketCost(nooftickits) ;
            System.out.println("Total amount: "+x);
            System.out.println("Available ticket after booking: "+Tickit.availableTickets);

        }
    }


}
