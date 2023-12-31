package org.delta.bank.account;

import javax.print.PrintService;
import java.util.HashMap;
import java.util.Map;

import com.google.inject.Inject;
import org.delta.bank.people.Owner;
import org.delta.bank.print.LoggerService;

public class AccountService {
    @Inject private AccountFactory accountFactory;
    private Map<String, BaseBankAccount> accounts;
    private LoggerService loggerService;
    public AccountService() {
        accounts = new HashMap<>();
    }

    public BaseBankAccount addBaseAccount(Owner owner, String accNumber,int balance) {
        BaseBankAccount account = accountFactory.createAccount(owner, accNumber, balance);
        storeAccount(account);
        return account;
    }

    public SavingBankAccount addSavingAccount(Owner owner, String accNumber,int balance) {
        SavingBankAccount account = accountFactory.createSavingAccount(owner, accNumber, balance);
        storeAccount(account);
        return account;
    }

    public StudentBankAccount addStudentAccount(Owner owner, String accNumber,int balance) {
        StudentBankAccount account = accountFactory.createStudentAccount(owner, accNumber, balance);
        storeAccount(account);
        return account;
    }

    private void storeAccount(BaseBankAccount account) {
        accounts.put(account.getAccountNumber(), account);
    }

    public Map<String, BaseBankAccount> getAccounts() {
        return accounts;
    }
}
