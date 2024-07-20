package Encapsulation.Bank;

public class BankRunner {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("12343324",1000.00); //constructor called
        System.out.println("Initial balance: "+bankAccount.getBalance());//checking initial balance...

        //amount deposited....
        bankAccount.deposit(200.0);
        System.out.println("Current Balance after Deposit: "+bankAccount.getBalance());

        //Amount withdrawal...
        bankAccount.withdraw(800.0);
        System.out.println("Current Balance after Withdrawal: "+bankAccount.getBalance());

        //some invalid results...
        bankAccount.deposit(-40.0);//providing invalid amount to deposit
        bankAccount.withdraw(2200.0);//providing insufficient amount to withdraw
    }
}
