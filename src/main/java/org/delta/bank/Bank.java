package org.delta.bank;

import org.delta.bank.account.AccountService;
import org.delta.bank.account.BaseBankAccount;
import org.delta.bank.account.StudentBankAccount;
import org.delta.bank.interest.AddInterestToAccount;
import org.delta.bank.moneyTransfer.MoneyTransferService;
import org.delta.bank.people.Owner;

import java.util.LinkedList;
import java.util.List;

public class Bank {
    public void run() throws Exception {
        System.out.println("helo bank");
        List<BaseBankAccount> accountCollection = new LinkedList<>();
        AccountService accountService = new AccountService();

        Owner owner = new Owner("pes","peso");
        BaseBankAccount bank = new BaseBankAccount(owner, "547477", 5550);
        BaseBankAccount bank2 = new BaseBankAccount(owner, "547477", 5550);

        MoneyTransferService moneyTransferService = new MoneyTransferService();
        moneyTransferService.transferMoney(bank, bank2, 200);

        BaseBankAccount studentAccount = new StudentBankAccount(owner, "447777", 5000);
        accountCollection.add(studentAccount);
        accountCollection.add(bank);
        accountCollection.add(bank2);

        AddInterestToAccount addInterestToAccount = new AddInterestToAccount();
        for (BaseBankAccount account : accountCollection){
            addInterestToAccount.add(account, account.getBalance());

            System.out.println(account.getOwner().getFullname() + "balance: " + account.getBalance());
        }

}
}
