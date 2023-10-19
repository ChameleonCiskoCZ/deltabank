package org.delta.bank.account;

import org.delta.bank.people.Owner;

public class AccountFactory {
    public BaseBankAccount createAccount(Owner owner, String accountNumber, double balance){
        return new BaseBankAccount(owner, accountNumber, balance);
    }
    public StudentBankAccount createStudentAccount(Owner owner, String accountNumber, double balance ){
        return new StudentBankAccount(owner, accountNumber, balance);
    }
    public SavingBankAccount createSavingAccount(Owner owner, String accountNumber, double balance ){
        return new SavingBankAccount(owner, accountNumber, balance);
    }

}
