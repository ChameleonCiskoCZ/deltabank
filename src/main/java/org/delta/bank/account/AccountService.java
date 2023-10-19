package org.delta.bank.account;

import javax.print.PrintService;
import java.util.HashMap;
import java.util.Map;

import org.delta.bank.people.Owner;

public class AccountService {
    private final AccountFactory accountFactory;
    private Map<String, BaseBankAccount> accounts;
    private PrintService printService;
    public AccountService(){
        this.accounts = new HashMap<>();
        this.accountFactory = new AccountFactory();
        this.printService = new PrintService();
    }
    public BaseBankAccount addBaseAccount(Owner owner, int balance) {
        BaseBankAccount account = accountFactory.createBaseAccount(owner, balance);
        storeAccount(account);
        return account;
    }

    public SavingBankAccount addSavingAccount(Owner owner, int balance) {
        SavingBankAccount account = accountFactory.createSavingAccount(owner, balance);
        storeAccount(account);
        return account;
    }

    public StudentBankAccount addStudentAccount(Owner owner, int balance) {
        StudentBankAccount account = accountFactory.createStudentAccount(owner, balance);
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
