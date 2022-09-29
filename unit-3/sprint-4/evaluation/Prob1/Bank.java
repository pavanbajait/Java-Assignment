package Prob1;
import java 
public class Bank {
    String branchName;
    String ifscCode;

    public Bank(String branchName, String ifscCode) {
        this.branchName = branchName;
        this.ifscCode = ifscCode;
    }

    public void displayDetails(){
        System.out.println("Branch Name: "+this.branchName);
        System.out.println("IFSC Code : "+this.ifscCode);
    }
}

class AxisBank extends Bank{
    double rateOfInterest;

    public AxisBank(String branchName, String ifscCode, double rateOfInterest) {
        super(branchName, ifscCode);
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public void displayDetails(){
        System.out.println("Branch Name: "+super.branchName);
        System.out.println("IFSC Code : "+super.ifscCode);
        System.out.println("Rate ofInterest : "+this.rateOfInterest);
    }
}
class ICICIBank extends Bank{
    double rateOfInterest;

    public ICICIBank(String branchName, String ifscCode) {
        super(branchName, ifscCode);
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public void displayDetails(){
        System.out.println("Branch Name: "+super.branchName);
        System.out.println("IFSC Code : "+super.ifscCode);
        System.out.println("Rate ofInterest : "+this.rateOfInterest);
    }
//    void getCreditCard(){
//        System.out.println("“Get the Credit Card from the Axis bank");
//    }
}

public class Demo {
    public static Bank getBank(String bank) {
        if(bank.equals("axis")) {
            return new AxisBank("Hinghanghat","UTIB0000808",5.25);
        }
        else if(bank.equals("icici")) {
            return new ICICIBank("Wardha","ICICI000121",5.0);
        }else {
            return null;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bank name");
        String bank = sc.next();
        Object obj = Demo.getBank(bank);
        if(obj instanceof AxisBank) {
            ((Bank) obj).displayDetails();
            ((AxisBank) obj).getCreditCard();
        }else {
            ((ICICIBank) obj).displayDetails();
        }
    }
}