package org.example;

public class BankAccount {
    private String accountHolder;
    private double depositAmount, withdrawAmount, bankBalance;
    private int accountNumber;
    BankAccount(String accountHolder, double depositAmount, int accountNumber){//For with deposit
        this.accountHolder = accountHolder;
        this.bankBalance = bankBalance+depositAmount;
        this.accountNumber = accountNumber;
    }
    BankAccount(int accountNumber, String accountHolder){//For no deposit
        this.accountHolder = accountHolder;
        this.depositAmount = bankBalance+depositAmount;
        this.accountNumber = accountNumber;
    }

    public void deposit(double depositAmount){
        if (depositAmount > 0){
            this.bankBalance = bankBalance+depositAmount;
        }else{
            System.out.println("Invalid amount, balance unchanged");
        }
    }
    public void withdrawAmount(double withdrawAmount){
        if (withdrawAmount > this.bankBalance){
            System.out.println("Failed to withdraw, insufficient balance");
        }else{
            this.bankBalance = this.bankBalance - withdrawAmount;
            System.out.println("Current balance: "+this.bankBalance);
        }
    }
    public void displayInfo(){
        System.out.println("Account Holder: "+this.accountHolder);
        System.out.println("Balance: "+this.bankBalance);
        System.out.println("Account Number: "+this.accountNumber);
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
}
