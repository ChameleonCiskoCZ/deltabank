package org.delta.bank.account;

import com.google.inject.Inject;
import org.delta.bank.people.Owner;
import org.delta.bank.print.LoggerService;

public class AccountFactory {
@Inject private LoggerService loggerService;
    public BaseBankAccount createAccount(Owner owner, String accountNumber, double balance){
        BaseBankAccount account = new BaseBankAccount(owner, accountNumber, balance);
        loggerService.logAccountCreation(account);
        return account;
    }
    public StudentBankAccount createStudentAccount(Owner owner, String accountNumber, double balance ){
        StudentBankAccount account = new StudentBankAccount(owner, accountNumber, balance);
        loggerService.logAccountCreation(account);
        return account;
    }
    public SavingBankAccount createSavingAccount(Owner owner, String accountNumber, double balance ){
        SavingBankAccount account = new SavingBankAccount(owner, accountNumber, balance);
        loggerService.logAccountCreation(account);
        return account;
    }

}
