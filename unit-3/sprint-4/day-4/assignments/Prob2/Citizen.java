package assignments.Prob2;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class Citizen {
    String name;
    String mobileNumber;
    String adharNumber;

    public Citizen(String name, String mobileNumber, String adharNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.adharNumber = adharNumber;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", adharNumber='" + adharNumber + '\'' +
                '}';
    }
}

class  Demo {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Name: ");
        String name = sc.next();
        System.out.println("Enter the 10 digit Mobile Number: ");
        String mobileNum = sc.next();
        System.out.println("Enter the 12 digit Adhar Card Number: ");
        String aadharCard = sc.next();
        Demo d = new Demo();
        boolean flag = d.validate(name, mobileNum, aadharCard);
        if(flag){
            Citizen ctz= new Citizen(name, mobileNum, aadharCard);
            System.out.println(ctz);
        }else{
            System.out.println("Invalid Citizen details");
        }
    }

    public boolean validate(String name, String mobileNum, String aadharCard){
        boolean flag1 = Pattern.matches("[A-Z][a-z]{2,7}", name);
        boolean flag2 = Pattern.matches("[789]{1}\\d{9}", mobileNum);
        boolean flag3 = Pattern.matches("\\d{12}", aadharCard);
        return (flag1 && flag2 && flag3);
    }
}