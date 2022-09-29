package Prob1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Write logic to get numberOfPassenger and numberOfKms
        System.out.println("Enter no of Passenger: ");
        int numberOfPassenger= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter no of kilometer: ");
        int numberOfKms= scanner.nextInt();
        Car c = new Car();
        c.setNumberOfPassenger(numberOfPassenger);

        OLA myOla = new OLA();
        Car myCar = myOla.bookCar(numberOfPassenger, numberOfKms);
        int res = myOla.calculateBill(myCar);
        System.out.println("The total fare amount is"+ res);
    }
}
