package Prob1;
import java.util.Scanner;
public class Car {
//    public int farePerkm;
    int numberOfPassenger;
    int numberOfKms;


    public void setNumberOfPassenger(int numberOfPassenger) {
        this.numberOfPassenger = numberOfPassenger;
    }
}

class Sedan extends Car {
    final int farePerKm =20;
    public int getFarePerKm(){
        return farePerKm;
    }
}

class HatchBack extends Car {
    final int farePerKm =15;
    public int getFarePerKm(){
        return farePerKm;
    }
}

class OLA {
    public Car bookCar(int numberOfPassenger, int numberOfKms){

        if (numberOfPassenger >= 3){
            Car car = new HatchBack();
            return car;
        }else{
            Car car = new Sedan();
            return car;
        }
    }
    public int calculateBill(Car car){
        int totalFare= (car.numberOfKms)*(car.farePerkm);
        return totalFare;
    }
}
