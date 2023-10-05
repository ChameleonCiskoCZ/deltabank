package org.delta.bank.account;

import people.Owner;

public class BankAccount {
    protected Owner owner;
    protected String bankaccountnumber;
    protected double balance;

    public BankAccount(Owner owner, String bankaccountnumber, double balance) {
        this.owner = owner;
        this.bankaccountnumber = bankaccountnumber;
        this.balance = balance;
    }
    
    public double getBalance(){
        return balance;
    }


    public void setBalance(double value) {
    }
}
