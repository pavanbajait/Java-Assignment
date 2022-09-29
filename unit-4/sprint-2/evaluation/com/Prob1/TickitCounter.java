package com.Prob1;

public class TickitCounter {
    int availableSeats = 3;
    void bookSeat(String name, int numberOfSeats) throws NoSeatAvailableException {
        synchronized (this) {
            if (numberOfSeats <= availableSeats) {
                this.availableSeats = this.availableSeats - numberOfSeats;
                System.out.println(numberOfSeats + " Seats are booked by "+name);
            } else {
                throw new NoSeatAvailableException("Sorry "+name+" "+numberOfSeats+" Seats are not available");
            }
        }
    }
}

class NoSeatAvailableException extends Exception{
    public NoSeatAvailableException(String msg){
        super(msg);
    }
}

class Threadx extends Thread{
    TickitCounter tickitCounter;
    String passengerName;
    int noOfSeatsToBook;

    public Threadx(TickitCounter tickitCounter, String passengerName, int noOfSeatsToBook) {
        this.tickitCounter = tickitCounter;
        this.passengerName = passengerName;
        this.noOfSeatsToBook = noOfSeatsToBook;
    }

    @Override
    public void run() {
        try {
            tickitCounter.bookSeat(passengerName, noOfSeatsToBook);
        } catch (NoSeatAvailableException e) {
            System.out.println(e.getMessage());
        }

    }
}

class Main{
    public static void main(String[] args) {
        TickitCounter tc = new TickitCounter();
        Threadx tr = new Threadx(tc, "Pavan", 2);
        Threadx tr1 = new Threadx(tc, "Shubham", 1);
        Threadx tr2 = new Threadx(tc, "Pankaj", 2);
        tr.setPriority(1);
        tr1.setPriority(5);
        tr2.setPriority(10);
        tr.start();
        try {
            tr.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        tr1.start();
        try {
            tr1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        tr2.start();

    }
}