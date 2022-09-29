package com.masai.assignment;

public class WeatherCheck {
    public static void main(String[] args) {
        boolean isSnowing = false;
        boolean isRaining = true;
        double temperature = 60.0;
        if(isRaining && isSnowing && temperature<50.0){
            System.out.println("Let's go out!");
        }else{
            System.out.println("Let's stay home.");
        }
    }
}
