package Prob3;

class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class Account {
    String accountNumber;
    double balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    void deposit(int amount){
       this.balance=this.balance+amount;
    }
    double withdraw(int amount) throws InsufficientFundsException{
        if(this.balance<amount){
            throw new InsufficientFundsException("Insuffiecent Fund in your Account");
        }else{
            this.balance = this.balance-amount;
        }

        return amount;
    }
}

class AccountDemo {
    public static void main(String[] args)  {
        Account act = new Account("7896541236");
        try {
            act.deposit(1500);
            double m = act.withdraw(2500);
            System.out.println(" Withdrawn amount "+m+" successfully");
        }catch(InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
//       System.out.println("Executed application");

    }
}