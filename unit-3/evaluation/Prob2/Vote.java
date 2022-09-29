package Prob2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        System.out.println("Enter the date of birth in dd-MM-yyyy format :");
        Scanner sc = new Scanner(System.in);
        String dob = sc.next();
        try{
            LocalDate date = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            LocalDate current = LocalDate.now();
            Period p = Period.between(date, current);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM");
            String dateOfBirth = dtf.format(date);
            String currentDate = dtf.format(current);
            if(date.isAfter(current)){
                System.out.println("Date of birth should not be in future");
            }else if(p.getYears()>=18 && currentDate.equals(dateOfBirth)){
                System.out.println("Happy Birthday, You are eligible to cast your vote");
            }else if(p.getYears()>=18){
                System.out.println("You are eligible to cast your vote.");
            }else{
                System.out.println("You are not eligible to vote");
            }
        }catch(DateTimeParseException dte){
            System.out.println("please pass the date in the proper format");
        }
    }
}
