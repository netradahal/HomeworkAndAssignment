package day5.lab1;

import java.util.Random;

public class BankAccount {

    private  int accountNumber = 0;
    private  String name;
    private  double balance;

    //open account using name only
    BankAccount(String name){
        this.name = name;
        this.balance = 0;
        this.accountNumber = new Random().nextInt(999999999 + 1 - 123456789) + 123456789;
    }
    //open account using name and initial balance
    BankAccount(String name, double balance){
        this.name = name;
        this.balance = balance;
        this.accountNumber = new Random().nextInt(999999999 + 1 - 123456789) + 123456789;
    }

    public static void main(String[] args) {
        //create account with name only
        BankAccount acct1 = new BankAccount("Account 1");
        BankAccount acct2 = new BankAccount("Account 2");
        BankAccount acct3 = new BankAccount("Account 3", 500); //account with initial balance

        acct1.depositFund(100, acct1); //deposit
        acct1.withdrawFund(20, acct1); //withdraw
        acct1.displayAccountInforation(); // display account1 information


        acct2.depositFund(50, 5, acct2); // deposit with interest rate
        acct2.withdrawFund(30, 2, acct2); // withdraw with fee
        acct2.displayAccountInforation(); // display account2 information

        acct3.depositFund(30, 4, acct3); // deposit with interest rate
        acct3.withdrawFund(20, 4, acct3); // withdraw with fee
        acct3.displayAccountInforation(); // display account3 information

    }

    public void withdrawFund(double fundToWithdraw, BankAccount acct) {
        acct.balance -= fundToWithdraw;
    }
    public void withdrawFund(double fundToWithdraw, double fee, BankAccount acct) {
        acct.balance -= (fundToWithdraw + fee);
    }
    public void depositFund(double addFund, BankAccount acct) {

        acct.balance += addFund;
    }
    public void depositFund(double addFund, double interestRate, BankAccount acct) {
        double totalInterest = (interestRate/100) * (acct.balance + addFund);
        acct.balance += (totalInterest + addFund);
    }
    public void displayAccountInforation() {
        System.out.println("The account name is: " + this.name +
                "\nThe account number is: " + this.accountNumber +
                "\nThe account balance is: " + this.balance + "\n");
    }
}

