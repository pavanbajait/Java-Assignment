package com.masai.assignment;

public class SwitchCase {
    public static void main(String[] args) {
        String city = "Mumbai";

        switch (city) {
            case "Mumbai" :
                System.out.println("Financial City");
                break;
            case "Kolkata" :
                System.out.println("City of Joy");
                break;
            case "Delhi" :
                System.out.println("Capital of Country");
                break;
            case "Bangalore" :
                System.out.println("Cyber City");
                break;
            default:
                System.out.println("May be Other Indian City");
        }
    }
}
