package Prob3;

public class Tickit {
    int ticketid;
    int price;
    static int availableTickets;
    public int calculateTicketCost(int nooftickets){
        if(nooftickets<availableTickets){
            availableTickets=availableTickets-nooftickets;
            int total=price*nooftickets;
            return total;
        }else{
            return -1;
        }
    }
}
