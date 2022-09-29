package assignments.Prob3;

public class Bank {
    private Bank(){
        System.out. println("Inside private constructor of Bank");
    }
    public static Bank getObject(){
        return new Bank();
    }

}


class Main{

    public static void main(String[] args) {
        Bank b =Bank.getObject();

    }

}