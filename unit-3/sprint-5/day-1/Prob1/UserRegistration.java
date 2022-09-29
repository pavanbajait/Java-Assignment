package Prob1;

import java.util.Scanner;

public class UserRegistration {
    public static void registerUser(String username,String userCountry) throws InvalidCountryException {
        if(userCountry.equals("India")){
            System.out.println("User registration done successfully");
        }else{
            InvalidCountryException ice = new InvalidCountryException("User Outside India cannot be registered");
            throw ice;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("****Register Profile****");
        System.out.println("Enter Your Name: ");
        String username = sc.next();
        System.out.println("Enter Your Country:");
        String userCountry = sc.next();
        try {
            registerUser(username, userCountry);
        } catch (InvalidCountryException ice) {
            System.out.println(ice.getMessage());
        }
    }
}
