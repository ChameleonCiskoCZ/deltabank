package org.delta.bank.account;

import org.delta.bank.people.Owner;

public class SavingBankAccount extends BaseBankAccount {
    public SavingBankAccount(Owner owner, String bankaccountnumber, double balance) {
        super(owner, bankaccountnumber, balance);
    }
}
