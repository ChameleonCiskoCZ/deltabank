package org.delta.bank.account;

import people.Owner;

public class SavingBankAccount extends BankAccount{
    public SavingBankAccount(Owner owner, String bankaccountnumber, double balance) {
        super(owner, bankaccountnumber, balance);
    }
}
