package org.delta.bank;

import com.google.inject.Inject;
import org.delta.bank.account.AccountFactory;
import org.delta.bank.account.AccountService;
import org.delta.bank.account.BaseBankAccount;
import org.delta.bank.account.StudentBankAccount;
import org.delta.bank.interest.AddInterestToAccount;
import org.delta.bank.moneyTransfer.MoneyTransferService;
import org.delta.bank.people.Owner;
import org.delta.bank.people.OwnerFactory;
import org.delta.bank.people.OwnerService;
import org.delta.bank.print.LoggerService;

import java.util.LinkedList;
import java.util.List;

public class Bank {
    @Inject private LoggerService loggerService;
    @Inject private OwnerService ownerService;
    @Inject private AccountService accountService;
    @Inject private OwnerFactory ownerFactory;
    public void run() throws Exception {
        System.out.println("helo bank");
        List<BaseBankAccount> accountCollection = new LinkedList<>();

        Owner pes = ownerService.addOwner("Pes","Peso");
        BaseBankAccount bank = new BaseBankAccount(pes, "547477", 5550);
        BaseBankAccount bank2 = new BaseBankAccount(pes, "547477", 5550);

        MoneyTransferService moneyTransferService = new MoneyTransferService();
        moneyTransferService.transferMoney(bank, bank2, 200);

        BaseBankAccount studentAccount = new StudentBankAccount(pes, "447777", 5000);
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
