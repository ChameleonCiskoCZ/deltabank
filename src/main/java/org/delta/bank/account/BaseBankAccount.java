package org.delta.bank.account;

import org.delta.bank.people.Owner;

public class BaseBankAccount {
    protected Owner owner;
    protected String bankaccountnumber;
    protected double balance;

    public BaseBankAccount(Owner owner, String bankaccountnumber, double balance) {
        this.owner = owner;
        this.bankaccountnumber = bankaccountnumber;
        this.balance = balance;
    }
    
    public double getBalance(){
        return balance;
    }
    public Owner getOwner() { return owner;}


    public void setBalance(double value) {
        balance = value;
    }
}
