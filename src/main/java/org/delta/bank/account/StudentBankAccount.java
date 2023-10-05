package org.delta.bank.account;

import people.Owner;

public class StudentBankAccount extends BankAccount{

    public StudentBankAccount(Owner owner, String bankaccountnumber, double balance) {
        super(owner, bankaccountnumber, balance);
    }
}
