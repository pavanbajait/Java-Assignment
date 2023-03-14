package com.Prob1;

import java.time.LocalDate;

public class DateManipulation {
    public static void main(String[] args) {
        LocalDate current = LocalDate.now();
        LocalDate afterw = current.plusWeeks(1);
        System.out.println("Date after 1 week: "+ afterw);

        LocalDate afterm = current.plusMonths(1);
        System.out.println("Date after 1 month: "+ afterm);

        LocalDate aftery = current.plusYears(1);
        System.out.println("Date after 1 year: "+ aftery);

        LocalDate aftTenY = current.plusYears(10);
        System.out.println("Date after 10 years: "+ aftTenY);
    }
}
