package org.delta.bank.account;

import org.delta.bank.people.Owner;

public class StudentBankAccount extends BaseBankAccount {

    public StudentBankAccount(Owner owner, String bankaccountnumber, double balance) {
        super(owner, bankaccountnumber, balance);
    }
}
