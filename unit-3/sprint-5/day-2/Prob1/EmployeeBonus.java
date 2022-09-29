package Prob1;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


public class EmployeeBonus {
    double method(String str) throws InvalidAgeException{
        try {
            LocalDate d1 = LocalDate.parse(str, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            LocalDate c1 = LocalDate.now();
            Period p = Period.between(d1, c1);
            if(d1.isAfter(c1)){
                throw new InvalidAgeException("Age Should not be in future");
            }else if (p.getYears()<1) {
                return 5000.00;
            }else if(p.getYears()>=1 & p.getYears()<2){
                return 8000.00;
            }else{
                return 10000.00;
            }
        }catch(DateTimeParseException dte){
            throw new InvalidAgeException("Please pass the date in the correct format");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your joining date in dd-MM-yyyy format");
        String date= sc.next();
        try{
            EmployeeBonus emp = new EmployeeBonus();
            double bonus = emp.method(date);
            System.out.println("You got the bonus of Rs: "+bonus);
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }


    }
}

class InvalidAgeException extends Exception{
    public InvalidAgeException(){

    }
    public InvalidAgeException(String message) {
        super(message);
    }

}