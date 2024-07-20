package Encapsulation.Bank;

public class BankAccount {
    private String accountNumber;
    private double balance;

    //constructor
    public BankAccount(String accountNumber, double balance)
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    //public method to get Balance
    public double getBalance() {
        return balance;
    }


    //public method to deposit amount is account
    public void deposit(double amount)
    {
        if(amount>0)
        {
            balance=+amount;
            System.out.println("Deposited Amount: "+amount);
        }
        else
        {
            System.out.println("Deposited Amount is Invalid!!");
        }
    }

    //public method to withdraw amount from account
    public void withdraw(double amount)
    {
        if(amount>0 && amount<=balance)
        {
            balance=-amount;
            System.out.println("Withdrew amount: "+amount);
        }
        else
        {
            System.out.println("Withdrew amount was Invalid!!");
        }
    }

}
