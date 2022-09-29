package Prob2;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Demo {
    public static LocalDate method() throws InvalidDateFormat{
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter date of birth in dd-MM-yyyy format");
            String dob = sc.next();
            LocalDate d1 = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            return d1;
        }
        catch(DateTimeParseException dte){
            throw new InvalidDateFormat("Invalid date format");
        }
    }
    public static void main(String args[]){
        try {
            LocalDate d1 = method();
            LocalDate c1 = LocalDate.now();
            Period p = Period.between(d1,c1);
            if(d1.getYear() > c1.getYear()) {
                System.out.println("Date should not be in Future");
            }else {
                System.out.println("your date of birth - " + d1);
            }
        } catch (InvalidDateFormat e) {
            System.out.println(e.getMessage());
        }

    }
}

class InvalidDateFormat extends Exception{
    public InvalidDateFormat(){

    }
    public InvalidDateFormat(String message) {
        super(message);
    }
}


