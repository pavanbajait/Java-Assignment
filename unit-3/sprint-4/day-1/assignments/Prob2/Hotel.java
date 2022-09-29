package assignments.Prob2;

import java.util.Scanner;

public interface Hotel {
    void chickenBiryani();
    void masalaDosa();
}

class TajHotel implements Hotel{
    public void chickenBiryani(){
        System.out.println("Chicken Biryani in Taj Hotel");
    }
    public void masalaDosa(){
        System.out.println("Masala Dosa in Taj Hotel");
    }
    public void welcomeDrink(){
        System.out.println("Welcome Drink from the TajHotel");
    }
}

class RoadSideHotel implements Hotel{
    public void chickenBiryani(){
        System.out.println("Chicken Biryani in Road Side Hotel");
    }
    public void masalaDosa(){
        System.out.println("Masala Dosa in Road Side Hotel");
    }
}

class Demo {
    public Hotel provideFood(int amount){
        if(amount > 1000){
            return new TajHotel();
        }else if(amount > 200 && amount <=1000){
            return new RoadSideHotel();
        }else {
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the amount for food: ");
        int amount = sc.nextInt();
        sc.nextLine();
        if(amount <=200){
            System.out.println("Please enter the valid amount.");
        }else{
            Demo d = new Demo();
            Hotel h = d.provideFood(amount);
            h.chickenBiryani();
            h.masalaDosa();
            if(h instanceof TajHotel){
                ((TajHotel) h).welcomeDrink();
            }
        }
    }
}