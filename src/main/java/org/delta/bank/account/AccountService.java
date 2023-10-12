package org.delta.bank.account;

import javax.print.PrintService;
import java.util.HashMap;

public class AccountService {
    private final AccountFactory accountFactory;
    private Map<String BaseBankAccount> accounts;
    private PrintService printService;
    public AccountService(){
        this.accounts = new HashMap<>();
        this.accountFactory = new AccountFactory();
        this.printService = new PrintService();


    }
}
