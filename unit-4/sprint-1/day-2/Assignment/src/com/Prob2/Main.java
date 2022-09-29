package com.Prob2;
import java.util.List;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> city = Arrays.asList("Nagpur", "Mumbai", "Pune", "Wardha");

        PrintList pr = cities -> {
            for(String c : cities) {
                System.out.println(c);
            }
        };
        pr.display(city);
    }
}

@FunctionalInterface
interface PrintList {
    abstract void display(List<String> city);
}

