package Prob3;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;
public class wages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start date in format dd-MM-yyyy:");
        try {
            String start = sc.next();
            System.out.println("Enter the end date in format dd-MM-yyyy:");
            String end = sc.next();
            LocalDate sd = LocalDate.parse(start, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            LocalDate ed = LocalDate.parse(end, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            if (ed.isAfter(sd)) {
                long days = ChronoUnit.DAYS.between(ed, sd);
                long wages = 1200 * days;
                System.out.println("Your Total Wages are Rs: " + wages);
            } else {
                System.out.println("Start date should be smaller than End date");
            }
        }catch(DateTimeException dte){
            System.out.println("Start date should be smaller than End date");
        }
    }
}
